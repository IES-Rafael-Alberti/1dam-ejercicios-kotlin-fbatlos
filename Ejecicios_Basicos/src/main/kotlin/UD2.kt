import kotlin.math.roundToInt
/**
 *
 */
fun ej2C2(){
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
fun ej3C2() {
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

/**
 *
 */
fun ej6C2(){
    try {
        print("Dame tu nombre : ")
        val nombre = readln().uppercase()
        if (nombre == ""){
            error("")
        }
        print("Dame tu sexo (F Femenino y M Masculino) : ")
        val sexo = readln().uppercase()
        if ((sexo == "M") || (sexo == "F")) {
            if (nombre.all { it.isLetter() }) {
                if ((sexo == "F" && nombre < "M") or (sexo == "M" && nombre > "N")) {
                    println("Estas en el grupo A")
                } else {
                    println("Estas en el grupo B")
                }
            } else {
                println("No se admiten numeros")
            }
        } else {
            error(" ")
        }
    }catch (_:Exception){
        print("Letra no es correcta")
    }
}

fun ej8C2(){
    try {
        print("Dime los puntos obtenidos : ")
        val puntos = readln().toFloat()
        if (puntos == 0.0.toFloat()){
            println("Tu nivel de rendimiento es inaceptable y tu bonificación es 0.0 ")
        }else
        if(puntos == 0.4.toFloat()) {
            println("Tu nivel de rendimiento es aceptable y tu dinero es 960.0")
        }else
        if(puntos >= 0.6){
            println("Tu nivel de rendimiento es meritorio y tu bonificación es ${puntos*2400}")
        }else{
            error("")
        }
    }catch (_:Exception){
        println("Numero no valido")
    }
}
fun ej10C2(){
    print("¿Eres vegetariano? si/no : ")
    val vegetariano = readln().lowercase()
    var resultado = "Su pizza es "
    var paso = true
    if (vegetariano == "si" || vegetariano == "sí"){
        resultado +="vegetariana y lleva : "
        println("Puedes seleccionar 2 ingredientes\n(1)Pimiento\n(2)Tofu\n(3)Pollo vegano\n(4)Peperoni vegano")
        var cont = 1
        do {
            print("Ingrediente numero ${cont}: ")
            val ingredientes = readln()
            when(ingredientes){
                1.toString() ->  resultado += "Pimiento"
                2.toString() ->  resultado += "Tofu"
                3.toString() ->  resultado += "Pollo vegetariano"
                4.toString() ->  resultado += "Peperoni vegano"
                else -> {
                    println("Ingrediente no valido")
                    cont--
                }
            }
            ++cont
            if (cont ==2 && paso){
                resultado += " y "
                paso = false
            }
        }while (cont != 3)
        println(resultado)
    }else
    if (vegetariano == "no"){
        resultado +="no vegetariana y lleva : "
        println("Puedes seleccionar 2 ingredientes : \n(1)Carne molida\n(2)Pull porck\n(3)Pollo\n(4)Peperoni")
        var cont = 1
        do {
            print("Ingrediente numero ${cont}: ")
            val ingredientes = readln()
            when(ingredientes){
                1.toString() -> resultado += "Carne molida"
                2.toString() -> resultado += "Pull porck"
                3.toString() -> resultado += "Pollo"
                4.toString() -> resultado += "Peperoni"
                else -> {
                    println("Ingrediente no valido")
                    cont--
                }
            }
            ++cont
            if (cont == 2 && paso){
                resultado += " y "
                paso = false
            }
        }while (cont != 3)
        println(resultado)
    }else{
        println("**ERROR")
    }

}

fun ej2I2(){
   try {
       print("Dime tu edad actual : ")
       val edad = readln().toInt()
       var cont = 1
       while (cont < edad+1) {
           println("Tu edad era de : ${cont}")
           cont++
       }
   }catch (_:Exception){
       println("Dato no valido")
   }
}

fun ej4I2(){
    try {
        print("Dime un numero para date la cuenta atras : ")
        val numero = readln().toInt()
        var cont = 0
        var fin = ""
        while (cont < numero+1) {
            fin +="${cont}, "
            cont++
        }
        println(fin.reversed().replaceFirst(",","")+".")

    }catch (_:Exception){
        println("Dato no valido")
    }
}

fun ej8I2(){
    try {
        print("Dime un numero  : ")
        val numero = readln().toInt()
        var cont = 1
        while (cont <= numero) {
            var fin = 1
            while (fin <= numero - cont ){
                print(" ")
                fin++
            }
            fin = cont
            while (fin>=1){
                if (fin%2 == 1)
                print("$fin ")
                fin-=2
            }
            println()
            cont++
        }
    }catch (_:Exception) {
        println("Dato no valido")

    }
}



