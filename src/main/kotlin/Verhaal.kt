class Verhaal {

    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun verhaal_level1(){
        println("$ansi_yelllo" + "Het is tweede wereldoorlog, de oorlog woedt in Europa. Jij bent een Duits soldaat\n" +
                "jij zit in een kamer van een oud gebouw, jij kijkt naar links dan zie je een sleutel en een hamer\n" +
                "jij moet naar de kamer waar wapens zijn,wat zou je hiervoor kiezen om deur te kunnen openen\n " +
                "wat voor element ga je kiezen$ansi_white sleutel$ansi_yelllo of$ansi_white hamer?")
    }
}