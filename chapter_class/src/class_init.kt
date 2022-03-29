// 생성자의 역할 : 멤버 변수의 초기화
// 코틀린의 기본 생성자 : 코드 블럭이 없다?! {}
// 멤버 변수의 초기값으로 쓰인다.

class Player2(_name: String, // 매개 변수 -> 지역 변수
              _healthPoints:Int,
             _isBlessed: Boolean,
             _isImmortal: Boolean) {
    // 멤버 변수
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim() }
    val healthPoints = _healthPoints // 매개 변수가 멤버 변수의 초기값으로 쓰인다.
    val isBlessed = _isBlessed
    private val isImmortal = _isImmortal

    fun castFireball(numFireballs: Int = 2) =
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

fun main(args: Array<String>) {
    val player = Player2("rinje", 99, true, true) // 생성자
    player.name = " hinana "
    println(player.name + " " + "ichikawa") // get
}