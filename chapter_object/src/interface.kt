// 인터페이스와 추상 클래스

// 추상 : 형태는 있는데 실체가 없는 것
// 추상 함수의 예
// ex) fun 이름(매개변수): 리턴타입 { -> 여기가 형태
// (여기가 실체)
// }

// 클래스 내부에 추상 함수가 있으면 추상 클래스
// abstract로 모양만 잡고 기능은 정의하지 않음 -> 하위 클래스에서 상속

// 클래스의 경우 : 멤버변수는 반드시 초기화가 되어야 한다(값을 가져야 한다), lazy로 지연시키는 건 가능


// interface -> 추상 클래스와의 차이 : 인터페이스는 추상 멤버로만 형태를 가질 수 있다, 생성자 자체가 없다
interface Fightable {
    var healthPoints: Int // 추상 속성들
    var diceCount: Int
    var diceSides: Int
    var damageRoll: Int
    fun attack(opponent: Fightable): Int // 추상 함수
}

interface Animal {
    fun walk()
    fun eat()
}

// 인터페이스 상속은 생성자가 없다 -> 클래스였으면 Animal() 이었을것
// 자식 클래스에서 모든 멤버를 오버라이드해야한다.
class Dog: Animal {
    override fun walk() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

}

class Cat: Animal {
    override fun walk() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }
}