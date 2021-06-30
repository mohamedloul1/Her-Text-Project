fun main(args: Array<String>) {
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

    var player = GameSettings()

    player.gameRegels()
    player.nameinput()


    println("Typ hier u leeftijd:")
    val age = readLine()!!.toInt()

    var underage: Int = 12

    if (age < underage) {
        print("$ansi_red" + "U bent minder 12 jaar dus u mag het speeltje niet spelen")
    }else{

        player.kledingKiezen()
        player.startVerhaal()

        var huidigeStatus = Status(  "verhaal gestart")

        println( "$ansi_white"+"Hallo " + "$mageneta"+"Speler"+ "$ansi_white Hieronder wordt je status weergeven:")

        huidigeStatus.show()

//        varibale naam oproepen vanuit de gemaakte classes
        var gameVerhaal = Verhaal()
        var gameLevel = Beslissing()

//-----------level1----------
        gameVerhaal.verhaal_level()
        gameLevel.level1()
    }





}

