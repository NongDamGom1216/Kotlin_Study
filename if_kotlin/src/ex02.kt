// 조건식 -> if 문의 마지막 라인이 값으로 표현된다.
// 변수 하나에 if else를 대입한다.(모든 케이스를 넣어야 한다.) -> if만 넣는 것 안됨
// 값이 결정되는 건 표현식(expression) -> 함수도 리턴값을 가져오므로 표현식이다.

fun main(args: Array<String>) {
    val name = "히나"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    // 아우라
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if(auraVisible) "GREEN" else "NONE"
    println(auraColor)

//    조건식(하나의 변수)
//    val healthStatus = if(healthPoints == 100) "최상의 상태임!"
//    else if (healthPoints >= 90) "약간의 찰과상만 있음."
//    else if (healthPoints >= 75)
//        if(isBlessed) "경미한 상처가 있지만 빨리 치유됨!"
//        else "경미한 상처만 있음."
//    else if (healthPoints >= 15) "많이 다친 것 같음"
//    else "최악의 상태임!"

//    이렇게 ..으로 범위 지정 가능
//    val healthStatus = if(healthPoints == 100) "최상의 상태임!"
//    else if (healthPoints in 90..99) "약간의 찰과상만 있음."
//    else if (healthPoints in 75..89)
//        if(isBlessed) "경미한 상처가 있지만 빨리 치유됨!"
//        else "경미한 상처만 있음."
//    else if (healthPoints in 15..74) "많이 다친 것 같음"
//    else "최악의 상태임!"

//    더 간편한 방법(c++의 switch 문과 유사)
//    여기서 화살표는 오퍼레이터(코틀린에는 포인터가 없다)
    val healthStatus = when(healthPoints) {
        100 -> "최상의 상태임!"
        in 90 .. 99 -> "약간의 찰과상만 있음."
        in 75..89 ->
            if (isBlessed) "경미한 상처가 있지만 빨리 치유됨!"
            else "경미한 상처만 있음."
        in 15..74 -> "많이 다친 것 같음"
        else -> "최악의 상태임!"
    }

    // 플레이어의 상태 출력
    // 변수 앞에 $를 써서 python의 f''처럼 사용 가능하다.
    println("$name : $healthStatus")
}