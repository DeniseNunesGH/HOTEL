package Hotel

import kotlin.system.exitProcess

fun cadastrarHospedes() {
    var listaHospedes = mutableListOf(
        "Carlos Villagran",
        "Maria Antonieta de las Nieves",
        "Roberto Gómez Bolaños",
        "Florinda Meza",
        "Ramón Valdés",
        "Rubén Aguirre",
        "Angelines Fernández",
        "Edgar Vivar",
        "Horácio Gómez Bolaños",
        "Raúl Padilla"
    )

    while (true) {
        println("""Cadastro de Hóspedes
        Selecione uma opção:
        1. Cadastrar
        2. Pesquisar
        3. Listar
        3. Sair""")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarNovoHospede(listaHospedes)
            2 -> pesquisarHospede(listaHospedes)
            3 -> listarHospedes(listaHospedes)
            4 -> sairCadastroDeHospedes()
            else -> erroCadastroDeHospedes()
        }
    }
}

fun cadastrarNovoHospede(listaHospedes: MutableList<String>) {
    println("Cadastro de Hóspedes.\nPor favor, informe o nome da Hóspede:")
    val novoHospede = readln()
    listaHospedes.add(novoHospede)

    println("$novoHospede cadastrada(o) com sucesso!")
    println("Lista de Hóspedes atuais " + listaHospedes)

    // Não é necessário chamar a função cadastrarHospedes(), pois o loop while já está chamando.
}

fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome da Hóspede:")
    val nomeHospede = readln()

    // Se o nome do hóspede estiver na lista, exibir o nome do hóspede.
    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {

        println("\nEncontramos a(s) hóspede(s):")
        // filter irá filtrar a lista de hóspedes e exibir apenas os que contém o nome informado.
        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) } // ignoreCase = true fará com que a busca não seja case sensitive.
            .forEach { println(it) } // forEach irá exibir cada hóspede encontrado.
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
    }
}

fun listarHospedes(listaHospedes: MutableList<String>) {

    listaHospedes.forEach{println(it)}


}

fun sairCadastroDeHospedes() {
    println("Você deseja sair? S/N")
    val escolha = readln()

    when (escolha.uppercase()) {
        // uppercase fará o que for digitado ser convertido para maiúsculo por exemplpo x -> X
        "S" -> {
            println("Hasta la vista, Baby.")
            iniciar()
        }
        "N" -> {
            println("Ok, voltando ao início.")
            cadastrarHospedes()
        }
        else -> {
            println("Desculpe, mas não compreendi.")
            sairCadastroDeHospedes()
        }
    }
}

fun erroCadastroDeHospedes() {
    println("Por favor, informe um número entre 1 e 3.")
}