// 단일 표현식 함수 -> 람다 함수랑 비슷함
// 리턴 타입 생략 가능 -> 타입 추론
// 반환 값이 없는 함수는 Unit 함수

private fun fromHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) "경미한 상처가 있지만 빨리 치유됨!" else "경미한 상처만 있음."
        in 15..74 -> "많이 다친 것 같음"
        else -> "최악의 상태임!"
    }

private fun castFireball(numFireballs: Int=2) =
    println("한 덩어리의 파이어블이 나타난다. (x$numFireballs)")

fun main(args: Array<String>) {
    var health = fromHealthStatus(100, true)
    println(health)
    castFireball()
}