package accessmodifiers

const val My_CONST = 100

class Employee {

}

data class Car(val color: String?, val model: String?, val year: Int?) {

}

fun main() {
    val emp = Employee()
    println(emp)

    val objects = Car("Red","Ford",2019)
    println(objects)

    println(My_CONST)
}
