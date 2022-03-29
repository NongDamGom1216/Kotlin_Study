// open 키워드를 통해 상속 허용
// open class: 상속을 허용
// open fun: 오버라이드를 허용

open class Room(val name: String) { // 주 생성자, public 멤버 변수
    fun description() = "Room: $name" // 상속은 가능하나, 재정의 불가
    open fun load() = "아무도 여기에 오지 않았습니다." // 상속, 재정의 가능
}

fun main(args: Array<String>) {
    var currentRoom = Room("Foyer")

    println(currentRoom.description())
    println(currentRoom.load())
}