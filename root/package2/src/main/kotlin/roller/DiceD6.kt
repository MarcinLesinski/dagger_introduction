package roller

import javax.inject.Inject
import kotlin.random.Random

internal class DiceD6
@Inject
constructor() {
    fun roll() = Random.nextInt(6) + 1
}
