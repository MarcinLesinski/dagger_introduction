package domain

import di.DaggerDiComponent

interface Roller {

    fun roll(): Int

    companion object {
        fun create(thresholds: Thresholds, dialog: ForceRoll): Roller =
            DaggerDiComponent
                .builder()
                .inject(thresholds)
                .inject(dialog)
                .build()
                .roller()
    }
}
