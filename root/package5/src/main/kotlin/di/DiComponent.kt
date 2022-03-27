package di

import roller.Roller
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DiModule1::class])
internal interface DiComponent {
    fun roller(): Roller
}
