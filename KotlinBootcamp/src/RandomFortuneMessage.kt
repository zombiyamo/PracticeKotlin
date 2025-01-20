fun main() {
    while (true) {
        print("Enter your birthday: ")
        val birthday = readlnOrNull()?.toIntOrNull() ?: 1
        val fortune = getFortuneCookie(birthday)
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) return
    }
}

fun getFortuneCookie(birthday: Int): String {
    val messages: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
        )

    return messages[birthday % messages.size]
}