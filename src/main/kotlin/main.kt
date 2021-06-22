fun main() {
    val conta = Conta() //conta aponta para o endereço da Conta()
    conta.titular = "Malkon"
    println(Conta().titular) // instancia a classe Conta. Aqui é um outro obj Conta
    println(conta.titular)
    //testaLacos()
}

class Conta {
    var titular = "Rodrigo"
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
    var i = 0
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
    }
    for (i in 1..5) { //or for(i in 5 downTo 1 step 2){
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
    }
}