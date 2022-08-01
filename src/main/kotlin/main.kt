fun main () {
    val likes: Int = 11
    var namePeople = ""
    if (likes%10 == 1 && likes%100 != 11)  namePeople = "человеку" else namePeople = "человекам"

    println("Понравилось $likes $namePeople")
}