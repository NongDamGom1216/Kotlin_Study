// enum 클래스
// 일련의 상수값을 정의하는 열거형 정의
// Direction.EAST → "EAST"

enum class Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
}

fun getDirectionName(direction: Direction) = when(direction) {
    Direction.NORTH -> "북"
    Direction.EAST -> "동"
    Direction.SOUTH -> "남"
    Direction.WEST -> "서"
}

enum class Direction2(private val str:String) { // 기본 생성자
    NORTH("북"),
    EAST("동"),
    SOUTH("남"),
    WEST("서"); // ; : 열거 상수 이후에 추가할 때 세미콜론

    val value: String = str
}

fun main(args: Array<String>) {
    var direction = Direction.SOUTH
    var direction2 = Direction2.EAST

    println(getDirectionName(direction))
    println(direction2.value)
}