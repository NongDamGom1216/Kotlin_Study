fun main(args: Array<String>) {
    // ?. 연산자 -> if 문처럼 사용
    // null이 아니면 .이후 실행
    // null이면 실행하지 않고 null 리턴

    // capitalize : 앞문자를 대문자로 바꿔줌
    var beverage = readLine()?.capitalize()
    println(beverage)


    // !!. 연산자 : null이 될 수 없다는 것을 단언하는 연산자
    // 주로 자바의 라이브러리를 사용할 때 쓰임
    var beverage2 = readLine()!!.capitalize()
    println(beverage2)

    // ?: 엘비스 연산자
    // 왼쪽 피연산자의 결과가 null이면 오른쪽의 피연산자를 실행
    // 디폴트값 지정
    var beverage3 = readLine()
    beverage3 = null
    if( beverage3 != null) {
        beverage3 = beverage3.capitalize()
    } else {
        println("beverage3가 null입니다!")
    }

    val beverageServed: String = beverage3 ?: "맥주"
    println(beverageServed)
}