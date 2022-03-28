// MutablaMap에 대응하는 java 콜렉션
// HashMap<K,V>

// 기존 자바로 작성된 라이브러리에서 이 타입을 많이 사용함

fun main(args: Array<String>) {
    val map = HashMap<String, Double>().apply{
        this["hinana"] = 0.0
        put("Rinje", 1.0)
    }

    println(map)

}