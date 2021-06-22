fun main() {
testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 0
    var numeroY = numeroX
    numeroY++
    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    //var contaMaria = contaJoao //contaMaria fica com endereço de contaJoao. Qualquer alteração nela reflete joao
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    var contaMaria2 = Conta() //instancia um novo obj Conta com novas posições na memória

    println("Conta João ${contaJoao.titular}")
    println("Conta Maria ${contaMaria.titular}")

    println(contaMaria) //vao ter os mesmo hashs, mesma referência na memoria
    println(contaJoao)

    println("Depositando na conta do João")
    deposita(contaJoao, 50.0)
    println(contaJoao.saldo)
    println("Depositando na conta da Maria")
    deposita(contaMaria, 70.0)
    println(contaMaria.saldo)
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor

}