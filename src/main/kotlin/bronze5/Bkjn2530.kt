package bronze5

import java.time.LocalTime

// https://www.acmicpc.net/problem/2530
fun main() {
    val input1 = readLine()?.split(' ')?.map { it.toInt() }!!
    val input2 = readLine()?.toLong()!!
    val (hour, minute, second) = input1
    val timeTake = input2

    val time = LocalTime.of(hour, minute, second).plusSeconds(timeTake)
    println("${time.hour} ${time.minute} ${time.second}")
}
