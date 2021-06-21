fun main() {
    println("Bem vindo")
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
   /* var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        saldo = 100 + 2.0 // resultado é em double
        saldo = 0.0
        saldo -= 300.00
        println("titular:" + titular)
        println("Titular $titular")//string template
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }*/
    /*for (i in 1..5) { //or for(i in 5 downTo 1 step 2){
        if (i == 4) {
            break
        }
        val titular: String = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        saldo = 100 + 2.0 // resultado é em double
        saldo = 0.0
        saldo -= 300.00
        println("titular:" + titular)
        println("Titular $titular")//string template
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }*/

    // testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else
        println("Conta é negativa")
}
