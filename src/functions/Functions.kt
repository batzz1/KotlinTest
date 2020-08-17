package functions

fun main() {

    println(multiply(4, 3, "Result is "))
    val employee = Employee("the hulk")
    println(employee.upperCase())
    val s = "this is in lower case"
    println(s.upperFirstAndLast())

    println(Utils().upperFirstAndLast("this is in lower case"))
}

fun multiply(first: Int, second: Int, result: String) = "$result ${first * second}"

class Employee(private val name: String) {
    fun upperCase() = name.toUpperCase()
}

//extension functions
fun String.upperFirstAndLast(): String {
        return this.substring(0, 1).toUpperCase() + this.substring(1, this.length - 1) + this.substring(this.length - 1).toUpperCase()
    }