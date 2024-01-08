import java.util.*
import kotlin.math.ceil
import kotlin.math.roundToInt

fun pedirnumero(): Float {
    val num = readln().toFloat()
    return num
}
fun ej25(){
    try{
        print("Dime tu fecha de nacimiento en formato dd/mm/aaaa : ")
        val fecha = readln()
        val fechas = fecha.split("/").toMutableList()
        if (fechas[1].toInt() >= 12){
            error(" ")
        }
        if (fechas[0].toInt() >= 31){
            error(" ")
        }
        if (fechas[1].toInt() == 2 && fechas[0].toInt() >= 21){
            error(" ")
        }
        print("Dia : ${fechas[0].toInt()}\n Mes : ${fechas[1].toInt()}\n Año : ${fechas[2].toInt()}")
    }catch (_:Exception){
        println("Dato no valido")
    }

}
/*
*
*/
fun ej24() {
    print("Dime cuanto vale en € (usa . para los centimos): ")
    val dinero = readln()
    val centimos = dinero.indexOf(string = ".") !=-1
    if (centimos == true) {
        val partes = dinero.split(".")
        print("Los euros son: ${partes[0]}\n Los centimos son: ${partes[1]}")
    }
    println("Los euros son: $")
}


/**
 * ej22() te pide una frase y una vocal , posteriormente te remplaza
 * las vocales en minuscula a mayuscula.
 */
fun ej22(){
    print("Dime una frase : ")
    val frase = readln()
    print("Dime la vocal para ponerla en mayusculas : ")
    val vocal = readln()
    println("Tu frase es : ${frase.replace(vocal.lowercase(),vocal.uppercase())}")

}

/**
 * El ej21 te pide una frase y con el .reversed la invierte
 */
    fun ej21(){
        try {
            print("Dime la frase: ")
            val frase = readln()
            println(frase.reversed())
        }
        catch (_: Exception) {
            print("**ERROR**")
        }
    }




/**
 * el ej20 te pedirá un  numero con prefijo y subfijo ej:+34-86745321-24 , 1º remplazamos los espacios por nada y convertimos
 * una lista apartor de la separacios de "-" y mostramos el numero.
 */
fun ej20(){
    try {
        print("Dime todo de tu numero de telefono(separalo con -): +")
        val numero_telefono_completo = readln()
        numero_telefono_completo.replace(" ","")
        val numero_telefono = numero_telefono_completo.split("-")
        numero_telefono[0].toDouble()
        numero_telefono[2].toDouble()
        println(numero_telefono[1].toDouble())
    }
    catch (_:NumberFormatException){
        println("**ERROR** Algo no es un numero")
    }
    catch (_:Exception){
        println("**ERROR**")
    }

}

/**
 * Esta función ej 18 preguntará al usuario su nombre , lo lee y lo muentra
 * all en mayusculas , tod en minuscula y muestra el nombre con all la primera
 * letra a all el nombre completo.
 */
fun ej18(){

        try {
            println("Dame tu nombre :")
            val nombre_completo = readln()
            nombre_completo.toDouble()
            println(nombre_completo.uppercase())
            println(nombre_completo.lowercase())
            val nombre = nombre_completo.split(" ").joinToString(" ")
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            println(nombre)
        }catch (_: IllegalStateException) {
            println("**Error** Dato fuera de rango.")
        }catch (e: Exception){
            println(e)
        }
}

/**
 * La funcion ej15 pedirá tu capital , que llamará a la funcion pedirnumero y esta
 * entrará en un while que calculará el interes anual del 4% de la cantidad añadida
 * durante 3 años.
 */
fun ej15() {
var cont = 0
    do {
        try {
            println("Dime tu capital para el interes: ")
            var capital = pedirnumero()
            if (capital <= 0) {
                error(" ")
            }
            var año = 0
            do {
                val interes = ((capital * 0.04)*100).roundToInt() / 100.00
                capital = (((capital + interes)*100).roundToInt() / 100.00).toFloat()
                año++
                println("Tú capital tras $año º año es de $capital")
            } while (año != 3)
            cont++
        } catch (_: NumberFormatException) {
            println("**ERROR** Dato invalido")
        } catch (_: IllegalStateException) {
            println("**Error** Dato fuera de rango.")
        } catch (e: Exception) {
            print("**ERROR** $e")
        }
    }while (cont==0)
}

/**
 * La funcion ej12 llamará a pedirnumero dos veces para saber su peso y su altura ,
 * en el print hacemos la operacion necesaria y la redondeamos hacia arriba.
 */
fun ej12() {
    var cont = 1
    do {
        try {
            println("Dime un tu peso en Kg:")
            val peso = pedirnumero()
            if (peso >= 300.00 || peso<=1 ) {
                error(" ")
            }
            println("Dime un tu altura en M:")
            val altura = pedirnumero()
            if (altura >= 3.00 || altura <= 0.2) {
                error(" ")
            }
            cont++
            println("Tu indice de masa corporal es ${((peso / (altura * altura))*100).roundToInt() / 100.00}")
        } catch (_: NumberFormatException) {
            println("**ERROR** No permitido")
        } catch (e: IllegalStateException) {
            println("**Error** Dato fuera de rango.")
        } catch (e: Exception) {
            println("**ERROR** $e")
        }
    }while (cont !=2)
}


/**
 * La función ej6 cogerá el numero y calculará el iva y se lo quitará e
 * imprimirá ambos valores
 *
 */
fun ej6(){
    var cont = 0
    do {
        try {
            println("Dime el precio final:")
            val precio = pedirnumero()
            if (precio <= 0) {
                error(" ")
            }
            var iva = precio * 0.10
            val siniva = ((precio - iva)*100).roundToInt() / 100.00
            iva = (iva*100).roundToInt() / 100.00
            cont++
            println("Importe del IVA $iva")
            println("Importe sin IVA $siniva")
        } catch (_: NumberFormatException) {
            println("**ERROR** Dato no permitido")
        } catch (_: IllegalStateException) {
            println("**Error** Dato fuera de rango.")
        } catch (e: Exception) {
            print("**ERROR** $e")
        }
    }while (cont==0)
}

/**
 * La función ej4 nos preguntará el numero que queramos pasarlo de celsius a fahrenheit
 * y nos lo devuelve.
 *
 */
fun ej4() {
    do {
        var cont = 0
        try {
            println("Dame los grados Celsius y te los Fahrenheit:")
            val celsius = pedirnumero()
            if (celsius > Math.pow(10.0, 32.0) || celsius <= -273.15) {
                error(" ")
            }
            val fahrenheit = (celsius * 9 / 5) + 32
            cont++
            println("La temperatura en Fahrenheir es $fahrenheit")
        } catch (_: NumberFormatException) {
            println("**ERROR** Dato no permitido")
        } catch (_: IllegalStateException) {
            println("**Error** Dato fuera de rango.")
        } catch (e: Exception) {
            print("**ERROR** $e")
        }
    }while (cont==0)
}