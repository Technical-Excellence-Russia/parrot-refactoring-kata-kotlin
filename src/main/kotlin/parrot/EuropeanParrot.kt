package parrot

class EuropeanParrot : Parrot() {

    override val speed: Double
        get() = baseSpeed

    override val type: ParrotTypeEnum
        get() = ParrotTypeEnum.EUROPEAN
}