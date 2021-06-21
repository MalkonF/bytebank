fun main(){
    println("Bem vindo")
    val titular: String = "Alex"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0 // resultado é em double
    saldo = 0.0
    saldo -=300.00
    println("titular:"+ titular)
    println("Titular $titular")//string template
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
    
}