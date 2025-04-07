package Hotel


fun arCondicionado() {


    var menorValor = Double.MAX_VALUE // Variável para armazenar o menor valor
    var empresaMaisBarata = "" // Nome da empresa com o menor orçamento

    do {
        // Pede o nome da empresa
        println("Qual o nome da empresa?")
        val nomeDaEmpresa = readln()

        // Pede o valor por aparelho
        println("Qual o valor do serviço por aparelho?")
        val valorPorAparelho = readln().toDoubleOrNull() ?: 0.0

        // Pede a quantidade de aparelhos
        println("Qual a quantidade de aparelhos?")
        val quantidadeAparelhos = readln().toIntOrNull() ?: 0

        // Pede a porcentagem de desconto
        println("Qual a porcentagem de desconto (pode ser 0)?")
        val porcentagemDesconto = readln().toDoubleOrNull() ?: 0.0

        // Pede a quantidade mínima de aparelhos para desconto
        println("Qual a quantidade mínima de aparelhos para conseguir o desconto?")
        val quantidadeMinimaParaDesconto = readln().toIntOrNull() ?: 0

        // Calcula o valor total sem desconto
        val valorTotalSemDesconto = valorPorAparelho * quantidadeAparelhos

        // Calcula o desconto, caso a quantidade de aparelhos seja suficiente
        val valorComDesconto = if (quantidadeAparelhos >= quantidadeMinimaParaDesconto) {
            valorTotalSemDesconto * (1 - (porcentagemDesconto / 100))
        } else {
            valorTotalSemDesconto
        }

        // Mostra o resultado do cálculo para a empresa
        println("O serviço de $nomeDaEmpresa custará R$ ${"%.2f".format(valorComDesconto)}")

        // Verifica se este orçamento é o menor
        if (valorComDesconto < menorValor) {
            menorValor = valorComDesconto
            empresaMaisBarata = nomeDaEmpresa
        }

        // Pergunta se deseja informar novos dados
        println("Deseja informar novos dados? (S/N):")
        val continuar = readln().uppercase()

    } while (continuar == "S")

// Mostra o orçamento de menor valor ao final
    println("O orçamento de menor valor é o de $empresaMaisBarata por R$ ${"%.2f".format(menorValor)}")

}