package di


import app.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RollerModule::class, DbModule::class, BoardModule::class])
internal interface AppComponent {
    fun app(): App
}
