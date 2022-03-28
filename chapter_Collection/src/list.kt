// 코틀린의 컬렉션

// 수정 불가 / 수정 가능
// List/MutableList (중복을 허용)
// Set/MutableSet (중복을 허용하지 않음)
// Map/MutableMap (키와 값의 쌍으로 관리)

// 생성자 호출이 불가 -> 함수를 통해서 만든다
// List<Type> = listOf(값...)
// listOf<Type>(값...) -> 이게 더 편한듯

const val TAVERN_NAME = "Taernyl's Folly"


fun main(args: Array<String>) {
    val patronList = listOf<String>("Eli", "Mordoc", "Sophie")
    //val patronList: List<String> = listOf("Eli", "Mordoc", "Sophie")
    val patronList2 = mutableListOf<String>("Eli", "Mordoc", "Sophie") // 리스트의 요소를 변경할 때
    patronList.getOrElse(4) {"Unknown Patron"}
    // 인덱스가 유효하지 않은 값이면 람다 값 리턴

    println(patronList)
    println(patronList.size)
    println(patronList[0])

    patronList2.remove("Eli")
    patronList2.add("hinana")
    patronList2.add(0, "Alex")
    patronList2[1] = "rinje" // 수정
    println(patronList2)

    // 1에서 10까지의 짝수 리스트
    val list = (1..10).toMutableList() // 리스트를 선언하는 다른 방법
    list.removeIf{ it % 2 == 1 }
    println(list)
}
