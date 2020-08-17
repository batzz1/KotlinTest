package accessmodifiers

const val My_CONST = 100

class Employee(val name: String?) {

}

data class Car(val color: String?, val model: String?, val year: Int?) {

}

fun main() {
    val emp = Employee("John")
    val emp1 = Employee("John")
    println(emp == emp1)

    val objects = Car("Red", "Ford", 2019)
    println(objects)

    println(My_CONST)
}
