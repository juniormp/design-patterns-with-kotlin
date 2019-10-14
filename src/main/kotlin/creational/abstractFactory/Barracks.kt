package creational.abstractFactory

interface Unit

interface Infantry : Unit
class Rifleman : Infantry
class RocketSoldier : Infantry

enum class InfantryUnits {
    RIFLEMEN,
    ROCKET_SOLDIER
}

interface Vehicle : Unit
class APC : Vehicle
class Tank : Vehicle

enum class VehicleUnits {
    APC,
    TANK
}

class Barracks : Building<InfantryUnits, Infantry>{
    override fun build(type: InfantryUnits): Infantry {
        return when (type) {
            InfantryUnits.RIFLEMEN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}

class VehicleFactory : Building<VehicleUnits, Vehicle> {
    override fun build(type: VehicleUnits): Vehicle = when (type){
        VehicleUnits.APC -> APC()
        VehicleUnits.TANK -> Tank()
    }
}