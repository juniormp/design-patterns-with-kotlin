package creational.abstractFactory

interface Building<in UnitType, out ProducedUnit> where UnitType : Enum <*>, ProducedUnit : Unit {

    fun build(type: UnitType) : ProducedUnit

}