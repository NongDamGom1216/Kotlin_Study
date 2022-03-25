fun main(args: Array<String>) {
    val score = 89

    val grade = when(score) {
        100 -> "최고야 만점이야"
        in 80 .. 99 -> "잘했어"
        in 60 .. 79 -> "더 공부하자"
        else -> "지금 책 펴"
    }
    println("Your grade is $grade")
    println("Result: ${if(score >= 0) "PASS" else "FAIL"}")

}