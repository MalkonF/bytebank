fun main() {
    testaCopiasEReferencias()
}

class Conta(
    var titular: String,
    var numero: Int
) {
    //var titular = "" //quando vc declara var no construtor é como se vc declarasse ela aqui
    // var numero = 0
    var saldo = 2.0
        set(valor) { //private set(valor) set fica privado, nao acessível fora da classe
            if (valor > 0)
                field = valor
            println("Field: $field")//field é a var que recebe o valor quando vc atribui pro atributo.
            //quando vc chama o set o println aqui é mostrado
            //Todas as var no kotlin são properties, elas tem o set e get implicito
            //msmo quando n declarados explicitamente eles existem

        }
        get

    //constructor() //construtor padrão, declarando aqui vc consegue instanciar a classe sem nenhum atributo no construtor
    // constructor(titular: String, numero: Int) {
    //    this.titular = titular
    //     this.numero = numero
    // }


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
}

fun testaCopiasEReferencias() {
    val numeroX = 0
    var numeroY = numeroX
    numeroY++
    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = Conta("João", 1000)
    contaJoao.titular = "João"
    //var contaMaria = contaJoao //contaMaria fica com endereço de contaJoao. Qualquer alteração nela reflete joao
    var contaMaria = Conta("Maria", 1001)
    contaMaria.titular = "Maria"
    //var contaMaria2 = Conta() //instancia um novo obj Conta com novas posições na memória

    println("Conta João ${contaJoao.titular}")
    println("Conta Maria ${contaMaria.titular}")

    println(contaMaria) //vao ter os mesmo hashs, mesma referência na memoria
    println(contaJoao)
    contaJoao.saldo = 50.0
    contaMaria.saldo = 40.0
    println(contaJoao.saldo)
    println(contaMaria.saldo)


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

