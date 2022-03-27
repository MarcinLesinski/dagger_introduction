package roller

import domain.Thresholds

internal class ThresholdsAdapter(): Thresholds {
    override fun easy(): Int = 1

    override fun normal(): Int = 3

    override fun hard(): Int = 6

}
