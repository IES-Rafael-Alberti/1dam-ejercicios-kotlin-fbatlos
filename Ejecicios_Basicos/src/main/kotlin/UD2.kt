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