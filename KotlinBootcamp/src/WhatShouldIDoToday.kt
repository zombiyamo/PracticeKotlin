fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "cloudy"))
    println(whatShouldIDoToday("happy", temperature = 20))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return if (mood == "happy" && weather == "sunny" && temperature in 20..30) {
        "go for a walk"
    } else {
        "Stay home and read."
    }
}