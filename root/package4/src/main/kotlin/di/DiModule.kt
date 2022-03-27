package di

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import roller.Dice
import roller.DiceD6
import roller.ThirdPartyDiceD12

@Module(includes = [DiModule.Bindings::class])
internal class DiModule {

    @Provides
    fun providesD12(): ThirdPartyDiceD12 = ThirdPartyDiceD12()

    @Module
    interface Bindings {
        @Binds @Named("D12")
        fun bindD12(d12: ThirdPartyDiceD12): Dice

        @Binds @Named("D6")
        fun bindD6(d6: DiceD6): Dice
    }
}
