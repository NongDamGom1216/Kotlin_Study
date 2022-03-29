// 동반 객체
// Java의 static 멤버에 해당
// companion object 키워드 사용
// 하나의 클래스에는 하나의 동반 객체만 정의 가능
// 클래스 내부에 상수 정의할 때 사용



// 객체 표현식
// val abandonedTownSquare = object : TownSquare() {
//    override fun load() = "환영받을 것을 예상헀겠지만 여기는 아무도 없군요...")
// }



// 중첩 클래스
// 클래스 내부에서 정의된 클래스 -> inner 키워드로 클래스 내부에 정의

// data 클래스
// 데이터를 저장하기 위해 특별히 설계된 클래스
// toString, equals, copy 등의 메서드가 데이터를 기반으로 자동 생성
data class User(var name:String, var email:String, var phone:String)
class User2(var name:String, var email:String, var phone:String)
class User3(var name:String, var email:String, var phone:String){ //toString()을 오버라이드 재정의
    override fun toString() = "User2[name=$name, email=$email, phone=$phone]"

    // 컨트롤 + O 누르면 오버라이드 가능 함수 볼수있음
    override fun equals(other: Any?): Boolean {
        // 매개변수 1개
        // this --> user5, other --> user6
        val o = other as User3 // 타입을 바꾸는 표현, o의 타입: User2

        return name == o.name && email == o.email && phone == o.phone
    }
}

fun main(args: Array<String>) {
    // data 클래스
    val user1 = User("hinana", "hinana@naver.com", "010-1111-1111")
    val user2 = User("hinana", "hinana@naver.com", "010-1111-1111")
    println(user1.toString()) // 문자열 변환
    println("user1 : $user1")
    println(user1 == user2) // 내부적으로 equals 호출됨, true
    println(user1 === user2) // 메모리 비교, false

    println("------------------------------------")

    // 일반 클래스
    val user3 = User2("hinana", "hinana@naver.com", "010-1111-1111")
    val user4 = User2("hinana", "hinana@naver.com", "010-1111-1111")
    println(user3.toString()) // User2에서 오버라이드 재정의를 안했다면 최상위 클래스인 Any에서 정의된 toString() -> 메모리 값을 리턴
    println(user3 == user4) // false

    println("------------------------------------")

    val user5 = User3("hinana", "hinana@naver.com", "010-1111-1111")
    val user6 = User3("hinana", "hinana@naver.com", "010-1111-1111")
    println(user5.toString()) // 오버 라이드 재정의 함수, true
    println(user5 == user6)
}