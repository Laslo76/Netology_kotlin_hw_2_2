fun main() {
    val likes: Int = 1111

    val postfix:String = if (likes % 10 == 1 && likes % 100 != 11) "человеку"  else "людям"
    println("Понравилось $likes $postfix")
}