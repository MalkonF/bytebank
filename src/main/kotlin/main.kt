fun main() {
    val numeroX = 0
    var numeroY = numeroX
    numeroY++
    println("NumeroX $numeroX")
    print("NumeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao //contaMaria fica com endereço de contaJoao. Qualquer alteração nela reflete joao
    contaMaria.titular = "Maria"
    var contaMaria2 = Conta() //instancia um novo obj Conta com novas posições na memória

    println("Conta João ${contaJoao.titular}")
    println("Conta Maria ${contaMaria.titular}")

    println(contaMaria) //vao ter os mesmo hashs, mesma referência na memoria
    println(contaJoao)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}