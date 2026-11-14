package com.example.reto3

fun main(){

    temperaturas()
}

fun contrasenya(){

    println("Introduce una contraseña: ")
    val contrasenya = readln()
    var valida = true

    if (contrasenya.length < 8){
        println("- La contraseña debe tener mínimo 8 caracteres")
        valida = false
    }
    if (!contrasenya.any { it.isDigit() }){
        println("- Falta un número")
        valida = false
    }
    if (!contrasenya.any{ it.isUpperCase()}){
        println("- Falta una letra mayúscula")
        valida = false
    }
    if (!contrasenya.any{ it.isLowerCase()}){
        println("- Falta una letra minúscula")
        valida = false
    }
    if (contrasenya.any{ it.isWhitespace()}){
        print("- No debe contener espacios")
        valida = false
    }

    if (valida){
        println("La contraseña es valida")
    }
}

/*2. Crea un programa donde:
El usuario introduce temperaturas hasta escribir fin.
El programa debe mostrar:
La temperatura máxima.
La mínima.
La media.
Cuántas temperaturas están por encima de la media.
La diferencia máxima entre dos temperaturas consecutivas.
Si la temperatura subió, bajó o se mantuvo entre cada medición.*/


fun temperaturas(){

    val temperaturas = mutableListOf<Int>()


    println("Introduce temperaturas, cuando quieras parar escribe fin:")
    do{
        println("Introduce temperatura:")
        var entrada = readln()

        val temperatura = entrada.toIntOrNull()

        if (temperatura != null){
            temperaturas.add(temperatura)

            println("Temperatura añadida")
        }
        else{
            println("Introduce un numero válido")
        }

    }
    while (!entrada.lowercase().equals("fin"))

    var max = 0
    var min = 0
    var media = 0.0

    for (temp in temperaturas){

        if (temp > max){
            max = temp
        }
        if (temp < min){
            min = temp
        }

        media += temp
    }
    println("Temperatura máxima = $max")
    println("Temperatura minima = $min")
    media = media.div(temperaturas.size.toDouble())
    println("Temperatura media = $media")

    var aboveAverage = 0
    for (temp in temperaturas){
        if (temp > media){
            aboveAverage += 1
        }
    }

    println("Por encima de la media: $aboveAverage")

    var mayorVariacion = 0

    for (i in 1 until temperaturas.size) {
        val diferencia = kotlin.math.abs(temperaturas[i] - temperaturas[i - 1])

        if (diferencia > mayorVariacion) {
            mayorVariacion = diferencia
        }
    }

    println("Mayor variación consecutiva: $mayorVariacion")

}

/*Crea una variable llamada correo que pueda contener un String o null.
Usa ?.let para mostrar el siguiente mensaje únicamente cuando el correo
no sea null: “Enviando mensaje a alumno@correo.com”. Si el correo es nulo
imprime: “No se ha indicado ningún correo”*/

fun correo() {
    val correo: String? = "alumno@correo.com"

    correo?.let {
        println("Enviando mensaje a $it")
    } ?: println("No se ha indicado ningún correo")
}r