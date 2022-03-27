package roller

import javax.inject.Inject
import kotlin.random.Random

internal class Roller
@Inject
constructor() {
    fun roll(): Int = Random.nextInt(6) + 1
}
