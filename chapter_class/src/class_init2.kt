// 기본 생성자에 속성 정의하기(이 방법이 더 주로 쓰인다)
// 기본 생성자는 오버로딩(함수 이름은 같으나 매개변수가 다름)이 불가능 -> 보조 생성자를 통해 오버로딩 지원
// 기본 생성자는 오직 1개, 보조 생성자는 여러 개 가능
// 기본 생성자와는 다르게 보조 생성자는 코드 블럭을 가질 수 있다. -> 멤버 변수 접근 가능

class Player3(_name: String,
              var healthPoints:Int, // 속성을 정의함으로써 멤버 변수 자동 선언, 디폴트는 public
              var isBlessed: Boolean,
              private val isImmortal: Boolean) {

    // lazy initalization : 변수나 속성이 최초 사용될 때까지 초기화를 연기
    // 해당 변수를 최초 사용할 때 람다 실행됨, 선언할 때는 실행디지 않음
    val hometown by lazy {
        println("hometown init")
        "Seoul" // 람다 함수의 마지막 문장이 리턴
    }

    // 멤버 변수
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    // 보조 생성자의 이름은 constructor
    // 보조 생성자는 반드시 기본 생성자를 호출해야 한다(this로 기본 생성자 호출)
    // var, val 불가능
    constructor(name:String) : this(name, healthPoints=100, isBlessed=true, isImmortal=false) {
        println("constructor init...")
        if(name.toLowerCase() == "rinje") healthPoints = 75 // 코드 블럭을 통해 멤버 변수 접근 가능
    }

    // 초기화 블록, init{ }로 정의
    // 속성값의 검사 및 설정을 수행, 파이선의 assert 문
    init {
        println("init block...")
        require(healthPoints > 0, {"healthPoints는 0보다 커야 합니다."})
        require(name.isNotBlank(), {"플레이어는 이름이 있어야 합니다."})
    }

    fun castFireball(numFireballs: Int = 2) =
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")

}

fun main(args: Array<String>) {
    val player = Player3("rinje") // 생성자
    println(player.name + " " + "morino") // get
    println(player.healthPoints)
    println(player.hometown)
}