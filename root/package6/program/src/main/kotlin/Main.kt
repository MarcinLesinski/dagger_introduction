import di.DaggerAppComponent

fun main() {
    val app = DaggerAppComponent.create().app()
    app.run()
}
