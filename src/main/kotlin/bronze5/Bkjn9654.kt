//SHIP NAME      CLASS          DEPLOYMENT IN SERVICE
//N2 Bomber      Heavy Fighter  Limited    21
//J-Type 327     Light Combat   Unlimited  1
//NX Cruiser     Medium Fighter Limited    18
//N1 Starfighter Medium Fighter Unlimited  25
//Royal Cruiser  Light Combat   Limited    4
fun main() {
    val format = "%-15s%-15s%-11s%-10s"
    val shipName = arrayOf("N2 Bomber", "J-Type 327", "NX Cruiser", "N1 Starfighter", "Royal Cruiser")
    val shipClass = arrayOf("Heavy Fighter", "Light Combat", "Medium Fighter", "Medium Fighter", "Light Combat")
    val deployment = arrayOf("Limited", "Unlimited", "Limited", "Unlimited", "Limited")
    val inService = arrayOf(21, 1, 18, 25, 4)
    println(String.format(format, "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"))
    for (i in 0..4) {
        println(String.format(format, shipName[i], shipClass[i], deployment[i], inService[i]))
    }
}

// 다른 답
// https://www.acmicpc.net/source/28944428