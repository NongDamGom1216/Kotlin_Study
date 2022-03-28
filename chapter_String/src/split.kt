// split : 특정 문자열을 기준으로 단어를 짤라 리스트에 담아 리턴

const val TAVERN_NAME2 = "Taernly's Folly"
fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
}
private fun placeOrder(menuData: String) {
    val indexofApostrophe = TAVERN_NAME2.indexOf('\'')
    val tarvernMaster = TAVERN_NAME2.substring(0 until indexofApostrophe)
    println("마드리갈은 $tarvernMaster 에제 주문한다.")
    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "마드리드갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message) }