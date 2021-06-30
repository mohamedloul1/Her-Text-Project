class GameSettings() {

    //    color code
    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun gameRegels() {
        println(
            "$ansi_green" + "Dit zijn ons gameregels:\n" +
                    "1-Als jij minder 12 jaar ben  dan helaas u kunt het speel niet spelen.\n" +
                    "2-Er zijn twee routes om het verhaal af te krijgen.\n" +
                    "3-Als jij 3 kansen hebt verlren dan moet je hele speel opnieuw starten.\n" +
                    "----------------------------------------------------------------------------"
        )
    }

    fun nameinput() {
        println("$ansi_white" + "Voer jouw naam in:")
        var username: String? = readLine()

        while (username!!.isBlank()) {
            println("$ansi_red" + "Jij bent verplicht om deze veld in te vullen.")
            username = readLine()
        }

        println("$ansi_white" + "Welkom " + "$mageneta" + username + "$ansi_white in Fighting game, \n")

    }

    fun kledingKiezen(){
        println(
            "$ansi_white"+"wat wil je aandragen militaire kleding of burger kleding: \n" +
                    "$ansi_green"+"1-militaire kleding\n" +
                    "2-burger kleding\n"
        )
        println("$ansi_white"+"Typ het nummer vanuit het volgende mogelijkheiden:")

        var karakter = readLine()!!.toInt()
        while (karakter !=1 && karakter !=2){
            println("$ansi_red" + "jij hebt onjuiste nummer gekozen, probeer het nogmaals opnieuw.")
            karakter = readLine()!!.toInt()
        }

        when (karakter) {
            1-> println("Jij hebt$ansi_blue militaire kleding$ansi_white gekozen")
            2 -> println("Jij hebt$ansi_blue burger kleding$ansi_white gekozen")
        }

        println("$ansi_white" + "-----------------------------------------------\n")
    }

    fun startVerhaal() {

        println("Typ$ansi_blue start$ansi_white om het verhaal te laten beginnen:")

        var startbutton: String? = readLine()!!.toLowerCase()
//        println(startbutton)

        while (startbutton != "start") {
            println("$ansi_red" + "Deze veld is verplicht op in te vullen")
            println("$ansi_white" + "Typ$mageneta start$ansi_white om het verhaal te laten beginnen")
            startbutton = readLine()!!.toLowerCase()
        }
        println(
            "Het verhaal van deze game is begonnen!\n\n" +
                    "------------------------$ansi_yelllo GESTART $ansi_white-----------------------------\n\n"
        )
    }
}