fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
    // call dirty processor
    dirtyProcessor()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    if (shouldChangeWater(day)) {
        print("Change the water today")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading() // デフォルト引数は呼び出し時に評価されるためファイル読み出しとかはパフォーマンスに影響する可能性あり
): Boolean {
    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    return when { // パラメータがない場合、if-else ifチェックのシーケンスとなる
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

// 関数の引数は最後にすることが推奨される
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    // ::をつけると解析される
    dirty = updateDirty(dirty, ::feedFish)
    // パラメータ構文
    // 最後のパラメータを解析しているため関数の括弧内にいれる必要がない
    // パラメータ構文を使うと言語に組み込まれているように見える関数を定義できる
    dirty = updateDirty(dirty) { dirty ->
        dirty + 50
    }
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[(Math.random() * week.size).toInt()]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}