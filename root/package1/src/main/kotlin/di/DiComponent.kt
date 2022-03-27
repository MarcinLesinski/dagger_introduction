package di

import roller.Roller
import dagger.Component

@Component
internal interface DiComponent {
    fun roller(): Roller
}
