// ArrayList는 생성자로 호출 가능하다 -> 자바의 콜렉션

fun main(args: Array<String>) {
    val array = ArrayList<String>()

    array.apply {
        add("Han")
        add("Lee")
        add("Jeong")
    }

    print(array)
}