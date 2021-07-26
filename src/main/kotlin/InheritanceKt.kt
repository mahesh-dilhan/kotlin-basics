open class Country {                // 1
    open fun produceVaccine(name: String, flag: Boolean) {       // 2
        println("${name} - ${flag}")
    }
}

class Pacific : Country() {       // 3
    override fun produceVaccine(name: String, flag: Boolean) {   // 4
        println("Pacific region ${name} - ${flag}")
    }
}

fun main() {
    val usa: Country = Pacific()
    usa.produceVaccine("USA", true)

    val china: Country = Country()
    china.produceVaccine("China", true)

}