package javacode

fun main() {
    val game = GameKT("WWE", "2K", "2020")
    game.year = "2021"
    println(game.name)
    println(game.manufacturer)
    println(game.year)
}