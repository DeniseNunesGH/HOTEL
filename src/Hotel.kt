package Hotel

var usuario = ""

fun main() {
    // Função principal que chama a função inicio().

    println("Insira o nome de usuário: ")
    usuario = readln()

    println("Insira sua senha: ")
    val senha = readln().toInt() //2.

    if (senha != 2678) {
        println("Senha incorreta. Tente novamente!")
        main()
    } else {
        print("Bem vindo ao Habbo! $usuario\n")
        iniciar()
    }
}

fun iniciar() {
    println("Escolha uma opção:")
    // A varival escolha armazena a opção escolhida pelo usuário.
    // uma variavel local é utilizada apenas dentro da função inicio().
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> comoSoletra()
        4 -> Evento()
        4 -> abastecimentoDeAutomoveis()
        5 -> sairDoHotel()
        else -> erro()
    }
}

fun sairDoHotel() {
    println("Você deseja sair?\n Informe 1 para \"sim\" e 0 para \"não\"")
    val confirma = readln().toBoolean() // digite true ou false ou 1 ou 0
    if (confirma) {
        println("Até logo!")
    } else {
        iniciar()
    }
}


fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    iniciar()
}