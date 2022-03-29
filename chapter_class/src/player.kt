// protected : 기본적으로 private 속성, 상속을 받은 클래스에서 접근 가능
// 디폴트는 public
// property : getter/setter(읽기/쓰기) 함수를 통해서 접근하는 속성, 정보

class Player {
    var name = "hinana" // 멤버 변수(타입은 String -> 타입 추론)
    // 핵심 : 클래스의 멤버 변수는 반드시 초기화가 되어야한다. 아닐 경우 에러 -> 초기값을 통해 자연스럽게 타입 추론이 된다.
        get() = field.capitalize() // 읽기, 여기서의 field는 name
        // 단일표현식 함수이기 때문에 return이 생략된 람다 함수이다.

        set(value) { // 쓰기, 공백을 제거하고 값을 넣어줌
            field = value.trim()
        }

    fun castFireball(numFireballs: Int = 2) = // 메서드
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

// 산출 속성 : 다른 속성이나 변수 등의 값을 사용해 자신의 값을 산출하는 속성
// 값을 저장할 필요가 없음(setter가 없음) -> val
class Dice() {
    val rolledValue
        get() = (1..6).shuffled().first()
}


fun main(args: Array<String>) {
    val player = Player() // 생성자
    player.name = "rinje "
    player.castFireball()
    println(player.name + "morino") // get

    println("-------------------")

    val myD6 = Dice()
    println(myD6.rolledValue)
    println(myD6.rolledValue)
    println(myD6.rolledValue)
}