fun main() {
    repeat(10, {
        val fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) return
    })
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readlnOrNull()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val messages: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
        )

    return when (birthday) {
        1, 2, 3, 4, 5 -> messages[0]
        in 6..10 -> messages[1]
        else -> messages[birthday.rem(messages.size)]
    }
}