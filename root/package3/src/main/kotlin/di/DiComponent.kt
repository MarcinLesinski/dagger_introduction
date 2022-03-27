package di

import roller.Roller
import dagger.Component

@Component(modules = [DiModule::class])
internal interface DiComponent {
    fun roller(): Roller
}
