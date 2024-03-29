
fun main() {

var op: Int

do {

    limpiaConsola()
    mostrarMenuPpal()
    op = pedirOpcion(0, 3)

    if (op != 0) {
    mostrarMenu(op)
    }

    } while (op != 0)

}


fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
var op = -1

    do {
    limpiaConsola()
    when (tipo) {
    1 -> {
        println("1. Ejercicio 04")
        println("2. Ejercicio 06")
        println("3. Ejercicio 12")
        println("4. Ejercicio 15")
        println("5. Ejercicio 18")
        println("6. Ejercicio 20")
        println("7. Ejercicio 21")
        println("8. Ejercicio 22")
        println("9. Ejercicio 24")
        println("10. Ejercicio 25")
    op = pedirOpcion(0, 12)
    when (op) {
        1 -> ej4()
        2 -> ej6()
        3 -> ej12()
        4 -> ej15()
        5 -> ej18()
        6 -> ej20()
        7 -> ej21()
        8 -> ej22()
        9 -> ej24()
        10 -> ej25()
    }
    }

    2 -> {
        println("1. EjCondicion 02")
        println("2. EjCondicion 03")
        println("3. EjCondicion 06")
        println("4. EjCondicion 08")
        println("5. EjCondicion 10")
        println("6. EjIterativa 02")
        println("7. EjIterativa 04")
        println("8. EjIterativa 08")

    op = pedirOpcion(0, 7)
    when (op) {
        1 -> ej2C2()
        2 -> ej3C2()
        3 -> ej6C2()
        4 -> ej8C2()
        5 -> ej10C2()
        6 -> ej2I2()
        7 -> ej4I2()
        8 -> ej8I2()
        9 -> ej13I2()
        10 -> ej15I2()
        11 -> ej19I2()
        12 -> ej25I2()
    }
    }

    3 -> {
    println("1. Listas 04")
    println("2. Listas 06")
    println("3. Diccionario 03")

    op = pedirOpcion(0, 3)
 //   when (op) {
     //   1 -> ejemplo2()
     //   2 -> ejemplo2()
    //    3 -> ejemplo2()
    }
    }
   // }
    } while (op != 0)

}

/**
* Pedir una opción del menú
* @param min Int - opción mínima
* @param max Int - opción máxima
*/
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
    print("Seleccione opción (0 = SALIR) >> ")
    opcion = try {
    readln().toInt()
    } catch (ex: NumberFormatException) {
    error = true
    -1
    }

    if (error || opcion !in min..max) {
    mensajeError(1)
    error = false
    }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
    1 -> println("**Opción no válida**")
    else -> {
    println("**Error desconocido**")
    }
    }
}

fun limpiaConsola() {
    for (i in 1..10) {
        println()
    }
}
