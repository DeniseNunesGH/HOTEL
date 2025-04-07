package Hotel

fun abastecimentoDeAutomoveis() {

    //carro
    //posto: Wayne Oil e O Stark Petrol
    //abastecimento: alcool e gasolina
    //preços ??
    //tanque: 42L
    //Considere que quando o álcool estiver 30% mais barato que a gasolina, é mais barato abastecer com álcool.
    //Dica: Regra de três.

    var gasolina = 42
    var posto1 = "Wayne Oil"
    var posto2 = "Stark Petrol"

    println("Qual o valor do álcool no posto Wayne Oil?: ")
    val valorAlcoolWayneOil = readln().toIntOrNull()

    println("Qual o valor da gasolina no posto Wayne Oil?: ")
    val valorGasolinaWayneOil = readln().toIntOrNull()

    println("Qual o valor do álcool no posto Stark Petrol?: ")
    val valorAlcoolStarkPetrol = readln().toIntOrNull()

    println("Qual o valor da gasolina nno posto Stark Petro?: ")
    val valorGasolinaStarkPetrol = readln().toIntOrNull()

    val alcoolWayneMaisBarato = valorAlcoolWayneOil!! <= (valorGasolinaWayneOil!! * 0.7)
    val alcoolStarkMaisBarato = valorAlcoolStarkPetrol!! <= (valorGasolinaStarkPetrol!! * 0.7)


    if (alcoolWayneMaisBarato && valorAlcoolWayneOil < valorAlcoolStarkPetrol) {
        println("É mais barato abastecer com álcool no posto Wayne Oil.")
    } else if (alcoolStarkMaisBarato && valorAlcoolStarkPetrol < valorAlcoolWayneOil) {
        println("É mais barato abastecer com álcool no posto Stark Petrol.")
    } else if (valorGasolinaWayneOil < valorGasolinaStarkPetrol!!) {
        println("É mais barato abastecer com gasolina no posto Wayne Oil.")
    } else {
        println("É mais barato abastecer com gasolina no posto Stark Petrol.")
    }




}
