fun main () {
    var likes: Int = 11
    var lasltNumber = likes.mod(10)
    var postfix:String = if (lasltNumber==1 && likes != 11) "человеку"  else "людям"
    println("Понравилось $likes $postfix")
}