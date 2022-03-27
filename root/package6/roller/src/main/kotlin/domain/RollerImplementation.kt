package domain

import javax.inject.Inject
import javax.inject.Named

internal class RollerImplementation
@Inject
constructor(
    @Named("D6") private val d6: Dice,
    private val thresholds: Thresholds,
    private val forceRoll: ForceRoll
) : Roller {
    override fun roll(): Int {

        val base = d6.roll()
        val result = when {
            base >= thresholds.hard() -> { base + 1 }
            base >= thresholds.normal() -> { base }
            base >= thresholds.easy() -> { base - 1 }
            else -> 0
        }

        return if (forceRoll.isUsed(result))
            d6.roll() - 2
        else
            result
    }
}
