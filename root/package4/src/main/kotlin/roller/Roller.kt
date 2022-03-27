package roller

import javax.inject.Inject
import javax.inject.Named


internal class Roller
@Inject
constructor(
    @Named("D6") private val d6: Dice,
    @Named("D12") private val d12: Dice
) {
    fun roll(): Int = d6.roll() + d12.roll()
}
