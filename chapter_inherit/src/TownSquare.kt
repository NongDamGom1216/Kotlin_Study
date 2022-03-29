// 관례 : 파일 하나에 클래스 하나

class TownSquare : Room("Town Square"){
    override fun load() = "환영합니다."
}

fun main(args: Array<String>) {
    var currenttown = TownSquare()
    println(currenttown.load())
    println(currenttown.description())
}