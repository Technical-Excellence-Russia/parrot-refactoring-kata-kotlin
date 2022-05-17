package parrot

import java.lang.Double.max

class AfricanParrot(private val numberOfCoconuts: Int) : Parrot() {
    override val type: ParrotTypeEnum
        get() = ParrotTypeEnum.AFRICAN

    private val loadFactor: Double
        get() = 9.0

    override val speed: Double
        get() = max(0.0, baseSpeed - loadFactor * numberOfCoconuts)
}