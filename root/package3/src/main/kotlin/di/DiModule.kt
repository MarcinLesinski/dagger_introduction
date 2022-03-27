package di

import dagger.Binds
import dagger.Module
import dagger.Provides
import roller.Dice
import roller.ThirdPartyDiceD12

@Module(includes = [DiModule.Bindings::class])
internal class DiModule {

    @Provides
    fun providesD12(): ThirdPartyDiceD12 = ThirdPartyDiceD12()

    @Module
    interface Bindings {
        @Binds
        fun bindD12(d12: ThirdPartyDiceD12): Dice
    }
}
