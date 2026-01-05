fun main() {
    val likes: Int = 1121

    val postfix = if (likes % 10 == 1 && likes % 100 != 11) "человеку"  else "людям"
    println("Понравилось $likes $postfix")
}