fun main() {
/* Инлайнинг(встраивание функции) используется для уменьшения
расхода памяти при использовании лямбда-функций.
        val greetingFunction = {playerName:String, numBuildings:Int ->
        val currentYear = 2020
        println("adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    runSimulation("Adler", greetingFunction)
}

inline fun runSimulation (playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..8).shuffled().last()
    println(greetingFunction(playerName,numBuildings))*/

/* Ссылка на функцию

    runSimulation("Adler", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

}

inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..12).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}*/

}