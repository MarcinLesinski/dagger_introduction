package domain

// 🚫 third party code 🚫
internal class ThirdPartyDiceD12 : Dice {
    private var result = 0
    override fun roll(): Int {
        result += 10
        return result
    }
}
