package bronze5

// https://www.acmicpc.net/problem/2420
fun main() {
    val input = readLine()?.split(' ')?.map { it.toLong() }
    input?.let {
        if (it.size >= 2) println(Math.abs(it[0] - it[1]))
    }
}
