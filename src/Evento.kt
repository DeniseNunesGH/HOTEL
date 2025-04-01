package Hotel

fun Evento() {
    println("1. Quantidade de convidados")

    println("Número de convidados: ")
    val numeroConvidados = readln()?.toIntOrNull() ?: 0

    if (numeroConvidados <= 0 || numeroConvidados > 350) {
        println("Quantidade inválida.")
        return
    }

    val laranjaCapacidade = 150
    val laranjaAdicional = 70
    val coloradoCapacidade = 350

    var auditorio = ""
    var cadeirasAdicionais = 0

    if (numeroConvidados <= laranjaCapacidade) {
        auditorio = "Laranja"
        println("Use o auditório Laranja.")
    } else if (numeroConvidados <= laranjaCapacidade + laranjaAdicional) {
        auditorio = "Laranja"
        cadeirasAdicionais - numeroConvidados - laranjaCapacidade
        println("Use o auditório Laranja (inclua mais $cadeirasAdicionais cadeiras")
    } else {
        auditorio = "Colorado"
        println("Use o auditorio Colorado.")
    }

    println("Agora vamos ver a agenda do evendo")

    println("2. Agenda")

    println("Data do evento: ")
    val horaEvento = readln()?.toIntOrNull() ?: 0

    val disponivel = when {
        diaEvento == "sabado" || diaEvento == "domingo" -> horaEvento in 7..14
        diaEvento in listOf("Seg", "Ter", "Qua", "Qui", "Sext") -> horaEvento in 7..12
        else -> false
    }

    if (!disponivel) {
        println("Auditório indisponível.")
        return
    }

    println("Qual o nome da empresa?: ")
    val nomeEmpresa = readln() ?: ""

    println("Auditorio reservado para $nomeEmpresa. ${diaEvento.capitalize()} às ${horaEvento}hs.")


    println("3. Garçons")

    println("Qual a duração do evento em horas?: ")
    val duracaoEvento = readln()?.toIntOrNull() ?: 0


}