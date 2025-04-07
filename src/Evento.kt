package Hotel

fun Evento() {
    println("1. Quantidade de convidados")

    println("Número de convidados? ")
    val numConvidados = readln()?.toIntOrNull() ?: 0

    if (numConvidados <= 0 || numConvidados > 350) {
        println("Quantidade inválida.")
        return
    }

    val laranjaCapacidade = 150
    val laranjaAdicional = 70
    val coloradoCapacidade = 350

    var auditorio = ""
    var cadeirasAdicionais = 0

    if (numConvidados <= laranjaCapacidade) {
        auditorio = "Laranja"
        println("Use o auditório Laranja.")
    } else if (numConvidados <= laranjaCapacidade + laranjaAdicional) {
        auditorio = "Laranja"
        cadeirasAdicionais = numConvidados - laranjaCapacidade
        println("Use o auditório Laranja (inclua mais $cadeirasAdicionais cadeiras")
    } else {
        auditorio = "Colorado"
        println("Use o auditorio Colorado.")
    }

    println("Agora vamos ver a agenda do evendo")

    println("2. Agenda")

    println("Dia do evento (Seg. a Dom.): ")
    val diaEvento = readln() // Lê o valor digitado como texto

    println("Hora do evento: ")
    val horaEvento = readln().toIntOrNull()

    val disponivel = when {
        diaEvento in listOf("sabado", "domingo") && horaEvento in 7..15 -> true
        diaEvento in listOf("segunda", "terça", "quarta", "quinta", "sexta") && horaEvento in 7..23 -> true
        else -> false
    }


    if (!disponivel) {
        println("Auditório indisponível. Horários de funcionamento:\n 7h00-23h00 (Seg. a Sex.) \n 7h00-15h00 (Sab. e Dom.).")
        return
    }

    println("Qual o nome da empresa?: ")
    val nomeEmpresa = readln() ?: ""

    println("Auditorio reservado para $nomeEmpresa. $diaEvento às ${horaEvento}hs.")


    println("\n\nGarçons")

    println("Informe o número de convidados:")
    val numeroConvidados = readln()?.toIntOrNull() ?: 0

    // Verificar número de convidados válido
    if (numeroConvidados <= 0) {
        println("Número de convidados inválido.")
        return // Encerra o programa caso o número de convidados seja inválido
    }

    // Perguntar a duração do evento
    println("Qual a duração do evento em horas?")
    val duracaoEvento = readln()?.toIntOrNull() ?: 0

    // Verificar duração válida
    if (duracaoEvento <= 0) {
        println("Duração do evento inválida.")
        return // Encerra o programa caso a duração seja inválida
    }

    // Calcular garçons necessários com base no número de convidados
    val garconsPorConvidados = if (numeroConvidados % 12 == 0) {
        numeroConvidados / 12 // Sem sobra, divide normalmente
    } else {
        (numeroConvidados / 12) + 1 // Arredonda para cima
    }

    // Adicionar garçons extras baseados na duração do evento
    val garconsExtras = duracaoEvento / 2
    val garconsTotais = garconsPorConvidados + garconsExtras

    // Calcular o custo total
    val custoPorGarcom = 10.50
    val custoTotal = garconsTotais * custoPorGarcom * duracaoEvento

    // Exibir os resultados
    println("São necessários $garconsTotais garçons.")
    println("Custo total: R$ $custoTotal")


}
