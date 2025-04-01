package Hotel

fun comoSoletra() { //aqui se localiza onde está a fun, sem necessidade de abrir essa fun no arquivo principal

    var resultado = 0.0
    var meia = 0
    var gratuita = 0

    while (true) {
        println("Qual o valor padrão da diária?: ")
        var diaria = readln().toDouble()

        println("Qual o nome do hóspede?: ")
        var hospede = readln()

        if (hospede.equals("pare", ignoreCase = true)) {
            break
        }
        println("Qual a idade do hóspede?: ")
        var idadeHospede = readln().toInt()

        if (idadeHospede < 6) {
            gratuita++
            println("$hospede cadastrado(a) com sucesso. $hospede possui gratuidade.")
        } else if (idadeHospede > 60) {
            meia++
            resultado += diaria / 2
            println("$hospede cadastrado(a) com sucesso. $hospede paga meia.")
        } else {
            resultado += diaria
            println("$hospede cadastrado(a) com sucesso.")
        }
    }

    println("$usuario, o valor total das hospedagens é: $resultado, $gratuita gratuidade, $meia meia.")

}