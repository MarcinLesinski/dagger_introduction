package roller

import kotlin.random.Random

// 🚫 third party code 🚫
internal class ThirdPartyDiceD12 : Dice {
    override fun roll() = Random.nextInt(12) + 1
}
