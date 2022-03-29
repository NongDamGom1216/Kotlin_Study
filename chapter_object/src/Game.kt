// object 선언
// 싱글톤을 만들 때 사용한다. (싱글톤 : 오직 한 개의 인스턴스만 운영하는 객체)
// class 키워드 없이 클래스 정의
// 자동 인스턴스화(생성자 호출 불가능)

object Game{
    init {
        println("방문을 환영합니다.")
    }

    fun play()
    {
        println("게임을 시작합니다.")
    }
}

fun main(args: Array<String>) {
    Game.play()
}
