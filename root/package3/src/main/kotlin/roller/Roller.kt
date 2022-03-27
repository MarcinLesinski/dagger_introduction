package roller

import javax.inject.Inject

internal class Roller
@Inject
constructor(
    private val d6: DiceD6,
    private val d12: Dice
) {
    fun roll(): Int = d6.roll() + d12.roll()
}
