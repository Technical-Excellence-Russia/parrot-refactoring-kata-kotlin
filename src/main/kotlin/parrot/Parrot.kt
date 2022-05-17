package parrot

fun createParrot(type: ParrotTypeEnum, numberOfCoconuts: Int, voltage: Double, isNailed: Boolean): Parrot {
    return when (type) {
        ParrotTypeEnum.EUROPEAN -> EuropeanParrot()
        ParrotTypeEnum.AFRICAN -> AfricanParrot(numberOfCoconuts)
        ParrotTypeEnum.NORWEGIAN_BLUE -> NorwegianBlueParrot(voltage, isNailed)
    }
}

abstract class Parrot {

    abstract val type: ParrotTypeEnum

    abstract val speed: Double

    protected val baseSpeed: Double
        get() = 12.0

}
