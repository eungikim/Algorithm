package bronze5

// https://www.acmicpc.net/problem/20499
fun main() {
    val (kill, death, assi) = readLine()?.split('/')?.map { it.toInt() }!!
    val result = if ((kill + assi) < death || death == 0) "hasu" else "gosu"
    println(result)
}
