package challenge.kotlincode

fun main() {
    val kotlinBicycle = KotlinBicycle(2, 3, 20)
    kotlinBicycle.printDescription()

    val kotlinBicycle1 = KotlinBicycle(2,4)
    kotlinBicycle1.printDescription()

    val kotlinMountainBike = KotlinMountainBike(4, 3, 4, 12)
    kotlinMountainBike.printDescription()

    val kotlinRoadBike = KotlinRoadBike(2, 3, 4, 11)
    kotlinRoadBike.printDescription()

    val kotlinRoadBike1 = KotlinRoadBike(2,3, 4)
    kotlinRoadBike1.printDescription()

    val kotlinMountainBike1 = KotlinMountainBike(1,4,3)
    kotlinMountainBike1.printDescription()
}

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear " + gear
                    + " with a cadence of " + cadence
                    + " travelling at a speed of " + speed + " Km/h."
        )
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int = 10) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The Mountain Bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int = 10) :
    KotlinBicycle(cadence, gear, speed) {
    override fun printDescription() {
        super.printDescription()
        println("The Road bike has a tire width of $tireWidth MM.")
    }
}


