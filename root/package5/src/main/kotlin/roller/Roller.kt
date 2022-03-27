package roller

import javax.inject.Inject
import javax.inject.Named


internal class Roller
@Inject
constructor(
    @Named("D6") private val d6A: Dice,
    @Named("D6") private val d6B: Dice,
    @Named("D6") private val d6C: Dice,
    @Named("D12") private val d12A: Dice,
    @Named("D12") private val d12B: Dice,
    @Named("D12") private val d12C: Dice
) {
    fun roll(): Int = d6A.roll() + d12A.roll() + d6B.roll() + d12B.roll() + d6C.roll() + d12C.roll()
}
