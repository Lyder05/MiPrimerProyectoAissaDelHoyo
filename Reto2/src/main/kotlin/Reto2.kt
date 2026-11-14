import kotlin.random.Random

//1. Completa el código para que imprima: “Mary is 20 years old”

fun nombreEdad() {
    val name = "Mary"
    val age = 20

    println("$name is $age years old")
}

//2. Declara de manera explícita el tipo de cada variable:

fun variables() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

//3. Tienes dos listas: una con numeros rojos y otras con números verdes.
//Completa el código para imprimir cuántos números hay en total:

fun contarNum() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    val total = greenNumbers.size + redNumbers.size

    println("Total de números: $total")
}

//4. Tienes un set de protocolos soportados por tu servidor. Un usuario
//pregunta por determinado protocolo y tu debes completar el código para
//informar si ese protocolo es sportado o no:

fun protocolos() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"

    val isSupported = requested.uppercase() in SUPPORTED

    println("Support for $requested: $isSupported")
}


//5. Crea un mapa mutable que guarde el nombre de tres alumnos y su nota:

fun alumnos() {
    val alumnos = mutableMapOf(
        "Ana" to 8.5,
        "Pedro" to 7.0,
        "Lucía" to 9.5
    )

    println(alumnos)
}

//6. Crea un juego donde ganas si al tirar dos dados salen los mismos números.


fun dados() {
    val firstResult = Random.nextInt(1, 7)
    val secondResult = Random.nextInt(1, 7)

    println("Primer dado: $firstResult")
    println("Segundo dado: $secondResult")

    if (firstResult == secondResult) {
        println("¡Has ganado!")
    } else {
        println("Has perdido")
    }
}

//7. Usa la expresión when y actualiza el siguiente programa para que imprima
//las acciones correspondientes según la letra que ponga:

fun botones() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}