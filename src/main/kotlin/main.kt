fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor)
            saldo -= valor
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor //tira da conta em que foi chamado o transfere
            destino.saldo += valor
            return true
        } else {
            return false
        }
    }

    fun getSaldo(): Double {
        return saldo
    }

    /*ao encapsularmos os atributos protegemos eles. Antes qualquer um podia colocar
         qualquer valor, agora podemos validarmos o valor antes de atribuir ao atributo */
    fun setSaldo(valor: Double) {
        if (valor > 0)
            saldo = valor
    }
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
    contaJoao.setSaldo(50.0)
    contaMaria.setSaldo(-70.0)
    println(contaJoao.getSaldo())
    println(contaMaria.getSaldo())


    /*println("Depositando na conta do João")
    contaJoao.deposita(50.0)
    println(contaJoao.saldo)
    println("Depositando na conta da Maria")
    contaMaria.deposita(70.0)
    println(contaMaria.saldo)

    println("Sacando João...")
    contaJoao.saca(20.0)
    println(contaJoao.saldo)
    println("Sacando Maria...")
    contaMaria.saca(25.0)
    println(contaMaria.saldo)

    println("Transferindo...")
    if (contaJoao.transfere(10.0, contaMaria))
        println("ok")
    else
        println("erro")*/
}

