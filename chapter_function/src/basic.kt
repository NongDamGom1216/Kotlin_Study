// 함수의 기본 표현

private fun fromHealthStatus(healthPoints: Int, isBlessed: Boolean): String { val healthStatus = when (healthPoints) {
    100 -> "최상의 상태임!"
    in 90..99 -> "약간의 찰과상만 있음."
    in 75..89 -> if (isBlessed) "경미한 상처가 있지만 빨리 치유됨!" else "경미한 상처만 있음."
    in 15..74 -> "많이 다친 것 같음"
    else -> "최악의 상태임!"
}
    return healthStatus
}

fun main(args: Array<String>) {
    val healthStatus = fromHealthStatus(90, true)
    println(healthStatus)
}