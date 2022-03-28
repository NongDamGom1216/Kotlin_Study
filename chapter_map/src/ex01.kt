// 파이선에서의 사전과 성격이 비슷하다.
// 리스트와 마찬가지로 수정 가능하게 하려면 mutable 붙여야함

//mapOf<K,T>(초기값)
// K : key 타입, T : value 타입
// <> 는 Generic이라고 부름

fun main(args: Array<String>) {
    val map = mutableMapOf<String, Double>(
        "Eli" to 10.5,
        "Sophie" to 5.5
//        Pair("Eli", 10.5),
//        Pair("Sophie", 5.5)
    )
    map += "Sophie" to 6.0
    println(map)

    map["Eli"] = 12.3
    println(map["Eli"])
    map["hinana"] = 12.0 // 사전에 추가도 가능
    println(map)

    var value: Double? // map[]의 리턴 타입은 Double? 이다. -> 없는 key를 제시하면 null이 리턴
    value = map["hinana"] // 위에서 Double을 썼으면 에러
    println(value)

    var value2: Double
    value2 = map["rinje"]?:0.0 // 또 다른 방법
    println(value2)
}
