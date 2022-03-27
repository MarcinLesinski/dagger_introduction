package di

import dagger.BindsInstance
import dagger.Component
import domain.ForceRoll
import domain.RollerImplementation
import domain.Thresholds
import javax.inject.Singleton

@Singleton
@Component(modules = [DiModule::class])
internal interface DiComponent {
    fun roller(): RollerImplementation

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun inject(thresholds: Thresholds): Builder
        @BindsInstance
        fun inject(forceRoll: ForceRoll): Builder
        fun build(): DiComponent
    }
}
