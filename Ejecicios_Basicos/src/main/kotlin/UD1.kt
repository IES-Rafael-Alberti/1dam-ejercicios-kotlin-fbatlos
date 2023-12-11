fun pedirnumero(): Float {
    val num = readln().toFloat()
    return num
}

fun ej12(){

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
        val iva = precio*1.10
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