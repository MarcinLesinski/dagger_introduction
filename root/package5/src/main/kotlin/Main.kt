import di.DaggerDiComponent

fun main() {
    val roller = DaggerDiComponent.builder()
        .build()
        .roller()

    println(roller.roll())
}
