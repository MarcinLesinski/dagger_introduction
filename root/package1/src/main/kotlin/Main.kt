import di.DaggerDiComponent
import di.DiComponent

fun main(){
    val roller = DaggerDiComponent
        .create()
        .roller()

    repeat(12) {
        println(roller.roll())
    }
}
