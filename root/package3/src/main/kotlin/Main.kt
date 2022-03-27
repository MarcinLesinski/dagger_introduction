import di.DaggerDiComponent

fun main(){
    val roller = DaggerDiComponent.builder()
        .build()
        .roller()

    repeat(12) {
        roller.roll()
    }
}
