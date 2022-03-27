package domain

interface ForceRoll {
    fun isUsed(actualResult: Int): Boolean
}
