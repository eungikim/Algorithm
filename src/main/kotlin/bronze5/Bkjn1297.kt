package bronze5

import java.util.Scanner

// https://www.acmicpc.net/problem/1297
fun main() = with(Scanner(System.`in`)) {
    val D = nextInt()
    val H = nextInt()
    val W = nextInt()
// 대각선 길이 h^2 + w^2 = D^2

    val dd = Math.pow(D.toDouble(), 2.0) / 25

    val height = Math.sqrt(dd * H)
    val width = Math.sqrt(dd * W)
    println("$height $width")
}