// 리스트 반복

fun main(args: Array<String>) {
    // 방법 1
    val patronList = mutableListOf<String>("Eli", "Mordoc", "Sophie")
    for(patron in patronList) {
        println("좋은 밤입니다. $patron 님")
    }

    println("---------------------------")

    // 방법 2
    patronList.forEach { patron ->
        println("좋은 밤입니다. $patron 님")
    }

    println("---------------------------")

    // 방법 3
    patronList.forEach { println("좋은 밤입니다. $it 님") }

    // 인덱스가 필요한 경우 forEachIndexed
    patronList.forEachIndexed { index, patron ->
        println("좋은 밤입니다. $patron 님 - 당신은 ${index+1} 번째 입니다.") }

}