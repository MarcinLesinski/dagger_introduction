package roller

import domain.ForceRoll

internal class ForceRollAdapter(): ForceRoll {
    override fun isUsed(actualResult: Int): Boolean {
        return when(readLine()){
            "Y", "y", "Yes", "yes", "tak", "No raczej!" -> true
            else -> false
        }
    }
}
