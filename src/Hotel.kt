package Hotel

var usuario = ""

fun main() {
    // Função principal que chama a função inicio().

    println("Insira o nome de usuário: ")
    usuario = readln()

    println("Olá, $usuario. Insira sua senha: ")
    val senha = readln().toInt() //2.

    if (senha != 2678) {
        println("Senha incorreta. Tente novamente!")
        main()
    } else {
        print("Bem vindo ao Habbo! $usuario. É um prazer imenso ter você por aqui!.\n")
        iniciar()
    }
}

fun iniciar() {
    println("""Escolha uma opção:
        |1. Cadastro de Quartos
        |2. Cadastro de Hóspedes
        |3. Meia entrada e gratuidade
        |4. Evento
        |5. Estacionamento
        |6. Manuteção
        |7. Sair
    """.trimMargin())
    // A varival escolha armazena a opção escolhida pelo usuário.
    // uma variavel local é utilizada apenas dentro da função inicio().
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> comoSoletra()
        4 -> Evento()
        5 -> abastecimentoDeAutomoveis()
        6 -> arCondicionado()
        7 -> sairDoHotel()
        else -> erro()
    }
}

fun sairDoHotel() {
    println("Você deseja sair do Habbo?\n Informe 1 para \"sim\" e 0 para \"não\"")
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
