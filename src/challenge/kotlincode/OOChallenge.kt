package challenge.kotlincode

fun main() {
    val kotlinBicycle = KotlinBicycle(2, 3, 20)
    kotlinBicycle.printDescription()

    val kotlinMountainBike = KotlinMountainBike(4, 3, 4, 12)
    kotlinMountainBike.printDescription()

    val kotlinRoadBike = KotlinRoadBike(2, 3, 4, 11)
    kotlinRoadBike.printDescription()
}

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear" + gear
                    + " with a cadence of " + cadence
                    + " travelling at a speed of " + speed + " Km/h."
        )
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The Mountain Bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int) : KotlinBicycle(cadence, gear, speed) {
    override fun printDescription() {
        super.printDescription()
        println("The Road bike has a tire width of $tireWidth MM.")
    }
}


