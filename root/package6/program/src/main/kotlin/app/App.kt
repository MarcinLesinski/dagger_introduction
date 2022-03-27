package app

import domain.Roller

import javax.inject.Inject

internal class App
@Inject
constructor(private val roller: Roller) {
    fun run() {
        roller.roll()
    }
}
