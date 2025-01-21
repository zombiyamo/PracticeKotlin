fun main() {
    print("Type your mood: ")
    val mood = readlnOrNull().toString()
    print(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        shouldStayInBed(mood, weather, temperature) ->
            "stay in bed"

        shouldGoForAWalk(mood, weather, temperature) ->
            "go for a walk"

        shouldGoSwimming(temperature) ->
            "go swimming"

        else ->
            "Stay home and read."
    }
}

fun shouldStayInBed(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun shouldGoForAWalk(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature in 20..30

fun shouldGoSwimming(temperature: Int) = temperature > 35