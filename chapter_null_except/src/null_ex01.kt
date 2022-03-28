// null을 디폴트로 허용하지 않음
// 따로 선언해줘야 가능 -> 타입 뒤에 ? 선언

// public fun readLine(): String ?
// 문자열 하나를 입력받음

fun main(args: Array<String>) {
    var signatureDrink: String ? = "맥주"
    signatureDrink = null // 에러가 아님
    println(signatureDrink)

    var beverage = readLine()
    beverage = null // 에러가 아님
    println(beverage)
}