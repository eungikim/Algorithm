//import java.util.Scanner

//fun main() {
//    val insert = readLine()
//    val delimitedInsert = insert?.split(" ")
//    println(delimitedInsert?.sumOf { it.toInt() } ?: "입력값 에러")
//}

fun main() = println(readLine()?.split(" ")?.sumOf { it.toInt() } ?: "입력값 에러")

