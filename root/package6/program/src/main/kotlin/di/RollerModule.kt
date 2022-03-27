package di

import dagger.Module
import dagger.Provides
import domain.Roller
import roller.ForceRollAdapter
import roller.ThresholdsAdapter

@Module(includes = [RollerModule.Bindings::class])
internal class RollerModule {

    @Provides
    fun provideRoller(): Roller {
        return Roller.create(ThresholdsAdapter(), ForceRollAdapter())
    }

    @Module
    interface Bindings {}
}
