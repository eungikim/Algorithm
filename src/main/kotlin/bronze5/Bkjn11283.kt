fun main() {
    // 첫째 줄에 글자 하나가 주어진다. 주어지는 글자는 UTF-8로 인코딩 되어 있는 한글이며, 문제 설명에 나온 방법으로 만들 수 있다.
    println("${readLine()?.single()?.code?.minus(44031)}")
}