package roller

import javax.inject.Inject

internal class DiceD6
@Inject
constructor() : Dice {
    override fun roll() = 6
}
