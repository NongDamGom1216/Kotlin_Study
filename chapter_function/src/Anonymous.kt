// 익명 함수, 매우 중요!
// 안드로이드에서 자주 쓰이는 방법
// 코틀린 관례 : 소문자로 시작하고 두번째단어 표기부턴 대문자 -> 낙타 표기법

// 익명 함수 : 이름이 없는 함수, 함수를 매개변수로 전달 가능, 람다 함수 형태 주로 사용

// func 이름(매개변수) : 리턴타입 { 함수 본체 } 가 기본형태
// func 이름 생략, 리턴타입 생략(Unit 함수)
// { 매개변수 -> 함수 본체 } 의 형태로 쓰인다.
// 함수 본체의 마지막 값이 리턴 값이다

// 파이선의 람다 함수 : 한 줄만 가능
// 코틀린의 람다 함수 : 여러줄 가능(마지막 값이 자동으로 리턴됨)

fun main(args: Array<String>) {
    // 문자열에서 특정 글자의 수 카운트하기
    // letter->letter=='s'가 익명 함수
    val numLetters = "Mississippi".count({ letter -> letter == 's' })
    println(numLetters)

//    파이썬에서의 원리
//    fun check(letter: Char) {
//        return letter == 's'
//    }
//    val numLetters = "Mississippi".count(check)
//    println(numLetters)

    println("----------------------------------")

//    또 다른 표현
    val numLetters2 = "Mississippi".count({ letter ->
        println("check: $letter")
        letter == 's'
    })
    println(numLetters2)

    println("----------------------------------")

// {}() 의 형태에서 매개 변수가 없는 익명 함수
// 람다 함수의 마지막 문장은 표현식이다.(이 값이 리턴된다)
    println({
        val currentYear = 2021
        "SimVillage 방문을 환영합니다. 촌장님!(copyright $currentYear)" }())

}