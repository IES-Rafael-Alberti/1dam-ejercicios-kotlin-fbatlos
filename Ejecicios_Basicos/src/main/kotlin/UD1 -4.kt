fun Fahrenheit(): Float {
    println("Dame los grados Celsius y te los Fahrenheit:")
    val celsius = readln().toFloat()
    val fahrenheit = (celsius*9/5)+32
    return (fahrenheit)

}

fun main(){
    try {
        val resultado = Fahrenheit()
        println("La temperatura en Fahrenheir es $resultado")
    }
    catch (e:)

}