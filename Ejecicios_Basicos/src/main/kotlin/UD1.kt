import java.util.*
import kotlin.math.ceil

fun pedirnumero(): Float {
    val num = readln().toFloat()
    return num
}







/**
 * Esta función ej 18 preguntará al usuario su nombre , lo lee y lo muentra
 * all en mayusculas , tod en minuscula y muestra el nombre con all la primera
 * letra a all el nombre completo.
 */
fun ej18(){
    println("Dame tu nombre :")
    val nombre_completo = readln()
    println(nombre_completo.uppercase())
    println(nombre_completo.lowercase())
    val nombre= nombre_completo.split(" ").joinToString(" ").replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(nombre)
}

/**
 * La funcion ej15 pedirá tu capital , que llamará a la funcion pedirnumero y esta
 * entrará en un while que calculará el interes anual del 4% de la cantidad añadida
 * durante 3 años.
 */
fun ej15() = try {
    println("Dime tu capital para el interes: ")
    var capital = pedirnumero()
    var año = 0
    do {
        val interes = capital*0.04
        capital = (capital+interes).toFloat()
        año++
        println("Tú capital tras $año º año es de ${ceil(capital)}")
    }while (año!=3)
}
catch (e: NumberFormatException) {
    println("**ERROR** $e")
} catch (e: Exception) {
    print("**ERROR** $e")
}

/**
 * La funcion ej12 llamará a pedirnumero dos veces para saber su peso y su altura ,
 * en el print hacemos la operacion necesaria y la redondeamos hacia arriba.
 */
fun ej12(){
    try {
        println("Dime un tu peso en Kg:")
        val peso = pedirnumero()
        println("Dime un tu altura en M:")
        val altura =pedirnumero()
        println("Tu indice de masa corporal es ${ceil(peso/(altura*altura))}")
    }
    catch (e: NumberFormatException) {
        println("**ERROR** $e")
    } catch (e: Exception) {
        print("**ERROR** $e")
    }
}


/**
 * La función ej6 cogerá el numero y calculará el iva y se lo quitará e
 * imprimirá ambos valores
 *
 */
fun ej6(){
    try {
        println("Dime el precio final:")
        val precio = pedirnumero()
        val iva = precio*0.10
        val siniva = precio - iva
        println("Importe del IVA $iva")
        println("Importe sin IVA $siniva")
    }
    catch (e: NumberFormatException) {
        println("**ERROR** $e")
    } catch (e: Exception) {
        print("**ERROR** $e")
    }
}

/**
 * La función ej4 nos preguntará el numero que queramos pasarlo de celsius a fahrenheit
 * y nos lo devuelve.
 *
 */
fun ej4() {
    try {
        println("Dame los grados Celsius y te los Fahrenheit:")
        val celsius = pedirnumero()
        val fahrenheit = (celsius * 9 / 5) + 32
        println("La temperatura en Fahrenheir es $fahrenheit")
    } catch (e: NumberFormatException) {
        println("**ERROR** $e")
    } catch (e: Exception) {
        print("**ERROR** $e")
    }
}