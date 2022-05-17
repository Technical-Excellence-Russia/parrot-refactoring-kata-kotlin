package parrot

import java.lang.Double.min

class NorwegianBlueParrot(private val voltage: Double, private val isNailed: Boolean) : Parrot() {
    override val type: ParrotTypeEnum
        get() = ParrotTypeEnum.NORWEGIAN_BLUE

    private fun getBaseSpeed(voltage: Double): Double = min(24.0, voltage * baseSpeed)

    override val speed: Double
        get() = if (isNailed) 0.0 else getBaseSpeed(voltage)
}

