fun main(args: Array<String>) {
    // 함수 타입
    // 함수를 변수에 대입하려면 해당 함수를 나타내는 타입이 필요

    // 변수 선언문의 형식
    // val 변수명 : (매개변수 목록) -> 함수의 리턴 타입 = 익명함수(마지막 줄이 리턴)

    // 변수 선언문
    val greetingFunction: () -> String = {
        val currentYear = 2021
        "SimVillage 방문을 환영합니다. 촌장님!(copyright $currentYear)"
    }
    println(greetingFunction())

    println("----------------------------------")

    // 함수 타입 표기시 매개변수명은 생략하고 타입만 기술
    val greetingFunction2: (String) -> String = {playerName ->
        val currentYear = 2021
        "SimVillage 방문을 환영합니다. $playerName!(copyright $currentYear)" }
    println(greetingFunction2("김선달"))

    println("----------------------------------")

    // it 키워드
    // 매개변수가 1개인 경우 이름 지정대신 it 키워드를 사용
    val greetingFunction3: (String) -> String = {
        val currentYear = 2021
        "SimVillage 방문을 환영합니다. $it!(copyright $currentYear)" }
    println(greetingFunction3("김선달"))

    println("----------------------------------")

    // it을 사용한 더 간단한 표현
    val numLetters = "Mississippi".count({ it =='s'})
    println(numLetters)

    println("----------------------------------")

    // 타입 추론 ()->타입 을 생략
    // 함수 본체에서 선언하고, 람다 함수의 마지막 문장이 리턴값
    val greetingFunction4 = { playerName: String, numBuildings: Int ->
        val currentYear = 2021
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName!(copyright $currentYear)"
    }
    println(greetingFunction4("김선달", 2))

    println("----------------------------------")

    // 함수를 인자로 받는 함수 정의하기
    val greetingFunction5 = { playerName: String, numBuildings: Int ->
        val currentYear = 2021
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName!(copyright $currentYear)"
    }
    // 따로 선언해줘야 함!
    runSimulation("김선달", greetingFunction5)

    println("----------------------------------")

    // 위 과정을 이렇게 단축할 수 있음
    // 람다 인자를 둘러싼 괄호를 생략, 앞에 있는 매개변수만 괄호 처리
    runSimulation("김선달") { playerName, numBuildings ->
        val currentYear = 2021
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName!(copyright $currentYear)"
    }
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 무작위로 선택
    println(greetingFunction(playerName, numBuildings))
}
