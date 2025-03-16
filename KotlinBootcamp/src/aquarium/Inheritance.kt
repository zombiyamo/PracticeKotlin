package aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    // プレコはこんなやつだよ https://images.app.goo.gl/xAuJACjtZwBSy9AE7
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus : FishAction, FishColor, FishColor by GoldColor {
    override fun eat() {
        println("eating algae")
    }

    override val color: String
        get() = "gold"
}

object GoldColor: FishColor {
    override val color = "gold"
}