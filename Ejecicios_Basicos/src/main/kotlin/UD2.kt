import kotlin.math.roundToInt

/**
 *
 */
fun ej2U2(){
    var cont = 0
    do {
        try {
            val contraseña = "panconpan123"
            print("Dime la contraseña: ")
            val contraseña_introducida = readln()
            if (contraseña == contraseña_introducida.lowercase()) {
                println("La contraseña es valida")
                cont++
            } else {
                println("La contraseña no es correcta")
            }
        }catch (_:Exception){
            println("**Error**")
        }
    }while (cont == 0)
}

/**
 *
 */
fun ej3U2() {
    do {
        var cont = 0
        try {
            print("Dime el dividendo: ")
            val dividendo = pedirnumero()
            print("Dime el divisor: ")
            val divisor = pedirnumero()
            if (divisor != 0.toFloat()) {
                cont++
                println("El resultado es ${((dividendo / divisor)*100).roundToInt() / 100.00}")
            } else {
                limpiaConsola()
                println("**Error**")
            }

        }catch (_:NumberFormatException){
            limpiaConsola()
            println("**ERROR** No es un numero")
        }
    } while (cont == 0)
}

fun ej6U2(){

}