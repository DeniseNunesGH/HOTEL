package Hotel

fun cadastrarQuartos() {

    // Criamos um array de 20 posições para representar os quartos (false = livre, true = ocupado)
    val quartos = BooleanArray(20) { false }

    // Loop principal do programa - continuará executando até que seja interrompido
    while (true) {
        // Etapa 1: Solicitar e validar o valor da diária
        println("Qual o valor padrão da diária?")
        val valorDiariaTexto = readLine() // Lê o valor digitado como texto
        val valorDiaria = valorDiariaTexto?.toDoubleOrNull() ?: 0.0 // Converte para número ou usa 0.0 se inválido

        // Verifica se o valor da diária é válido
        if (valorDiaria <= 0) {
            println("Valor inválido")
            continue // Volta ao início do loop
        }


        // Etapa 1: Solicitar e validar a quantidade de dias
        println("Quantas diárias serão necessárias?")
        val diasTexto = readLine()
        val quantidadeDias = diasTexto?.toIntOrNull() ?: 0 // Converte para número inteiro ou usa 0 se inválido

        // Verifica se a quantidade de dias é válida
        if (quantidadeDias <= 0 || quantidadeDias > 30) {
            println("Valor inválido")
            continue // Volta ao início do loop
        }

        // Calcula o valor total da hospedagem
        val valorTotal = valorDiaria * quantidadeDias
        println("O valor de $quantidadeDias dias de hospedagem é de R$$valorTotal")

        // Etapa 2: Solicitar o nome do hóspede
        println("Qual o nome do hóspede?")
        val nomeHospede = readLine() ?: "" // Lê o nome ou usa string vazia se for nulo

        var quartoEscolhido = false // Variável para controlar se um quarto válido foi escolhido
        var numeroQuarto = 0 // Variável para armazenar o número do quarto

        // Loop para escolha do quarto
        while (!quartoEscolhido) {
            // Etapa 3: Solicitar e validar o número do quarto
            println("Qual o quarto para reserva? (1 - 20)?")
            val quartoTexto = readLine()
            numeroQuarto = quartoTexto?.toIntOrNull() ?: 0 // Converte para número ou usa 0 se inválido

            // Verifica se o número do quarto é válido
            if (numeroQuarto < 1 || numeroQuarto > 20) {
                println("Número de quarto inválido. Por favor, escolha entre 1 e 20.")
                continue // Volta ao início do loop de escolha do quarto
            }

            // Verifica se o quarto está ocupado
            if (quartos[numeroQuarto - 1]) {
                println("Quarto está ocupado. Escolha outro.")
                exibirQuartos(quartos) // Mostra a lista de quartos
            } else {
                println("Quarto Livre.")
                quartoEscolhido = true // Quarto válido foi escolhido, sai do loop de escolha
            }
        }

        // Etapa 4: Confirmar a reserva
        println("Você confirma a hospedagem para $nomeHospede por $quantidadeDias dias para o quarto $numeroQuarto por R$$valorTotal? S/N")
        val confirmacao = readLine() ?: ""

        // Verifica se a reserva foi confirmada
        if (confirmacao.equals("S", ignoreCase = true)) {
            // Marca o quarto como ocupado
            quartos[numeroQuarto - 1] = true
            println("Reserva efetuada para $nomeHospede.")
        } else {
            println("Reserva não confirmada.")
        }


        // Exibe a lista atualizada de quartos
        exibirQuartos(quartos)
    }
}

fun exibirQuartos(quartos: BooleanArray) {
    // Cria uma string vazia que irá guardar a lista de quartos
    var listaQuartos = ""

    // Percorre o array de quartos
    for (i in 0 until quartos.size) {
        // Adiciona o número do quarto (i+1) e seu status (livre ou ocupado)
        listaQuartos += "${i + 1}- ${if (quartos[i]) "ocupado" else "livre"}"

        // Se não for o último quarto, adiciona um separador
        if (i < quartos.size - 1) {
            listaQuartos += "; "
        }
    }

        // Exibe a lista de quartos
        println(listaQuartos)

}