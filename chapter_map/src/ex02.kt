// Map의 순회
// map.forEach { key, value -> ... } 람다 함수

fun main(args: Array<String>) {
    val map = mutableMapOf<String, Double>(
        "Eli" to 10.5,
        "Sophie" to 5.5,
        "Hinana" to 7.0,
        "Rinje" to 10.0,
        "Hiori" to 5.0
    )

    // 첫 번째 방법
    map.forEach { (key, value) ->
        println("key: $key, value : $value")
    }

    println("-------------------------------")

    // 두 번째 방법
    for((key, value) in map) {
        println("key: $key, value : $value")
    }


}