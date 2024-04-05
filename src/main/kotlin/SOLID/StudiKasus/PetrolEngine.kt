package SOLID.StudiKasus

class PetrolEngine(private val oilPipe: OilPipe, private val piston: Piston): EngineInterface {
    override fun move() {
        val oil: Oil = oilPipe.suckOil()
        val energy: Energy = oil.burn()
        energy.push(piston)
    }
}

class Piston {
    fun move() {

    }
}

class OilPipe {
    fun suckOil(): Oil {
        return Oil()
    }
}

class Energy {
    fun push(piston: Piston) {
        piston.move()
    }
}

class Oil {
    fun burn(): Energy {
        // Do some cobustion process here
        return Energy()
    }
}

class Tank(): StorageInterface<Oil> {
    private lateinit var oil: Oil

    override fun fill(source: Oil) {
        this.oil = source
    }

    override fun getSource(): Oil {
        return oil
    }
}

