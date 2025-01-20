fun main() {
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(
    tankSize: Double, // ガロン単位
    currentFish: List<Int>, // 現在水槽にいる各魚の長さを表すリスト
    fishSize: Int = 2, // 水槽に追加したい魚の長さ
    hasDecorations: Boolean = true
): Boolean {
    return if (hasDecorations) {
        // 装飾ありならタンクの許容量は80%まで
        tankSize * 0.8 >= currentFish.sum() + fishSize
    } else {
        tankSize >= currentFish.sum() + fishSize
    }
}
