package roller

import javax.inject.Inject
import kotlin.random.Random

internal class Roller
@Inject
constructor(
    private val d6: DiceD6
) {
    fun roll(): Int = d6.roll()
}
