package roller

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class DiceD6
@Inject
constructor() : Dice {
    private var result = 0
    override fun roll(): Int {
        result += 1
        return result
    }
}
