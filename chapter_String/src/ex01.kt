// substring 함수 : 문자열 추출
// 파이선에서의 슬라이싱 생각

// until 키워드 : 범위를 지정하고, 상한 값은 포함되지 않음

const val TAVERN_NAME = "Taernly's Folly"
fun main(args: Array<String>) {
    placeOrder()
}
private fun placeOrder() {
    val indexofApostrophe = TAVERN_NAME.indexOf('\'')
    val tarvernMaster = TAVERN_NAME.substring(0 until indexofApostrophe)
    // 파이선에서의 [start:end] 처럼 0 부터 indexofApostrophe
    // 이 때 0 until indexofApostrophe 에서 indexofApostrophe는 미포함
    println("마드리갈은 $tarvernMaster 에게 주문한다.") }