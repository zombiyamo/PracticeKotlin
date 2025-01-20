import java.util.Calendar.*

fun main(args: Array<String>) {
//    println("Hello ${args[0]}!")
//    dayOfWeek()
//
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//
//    val message = "You are ${ if (temperature > 50) "fried" else "safe"}"
//    println(message)
    feedTheFish()
}

fun dayOfWeek() {
    println("今日は何曜日ですか?")
    val jpDayOfWeek = arrayOf(
        "日曜日",
        "月曜日",
        "火曜日",
        "水曜日",
        "木曜日",
        "金曜日",
        "土曜日"
    )[getInstance().get(DAY_OF_WEEK) - 1]
    println("今日は${jpDayOfWeek}です")
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[(Math.random() * week.size).toInt()]
}