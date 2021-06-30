class Beslissing:Status( "LEVEL1") {


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

    fun level1() {
        var level1: String? = readLine()!!.toLowerCase()

        while (level1 != "sleutel" && level1 != "hamer") {
            println("$ansi_red" + "Er zat iets die fout getypt zijn, probeer het nogmaals opnieuw$ansi_white")
            level1 = readLine()!!.toLowerCase()
        }

        if (level1 == "sleutel") {
            println("wowww goed gedaan!")
            name = "LEVEL1"
            level++
            score++
            status = "${ansi_green}In de kamer waar wapens zijn$ansi_white"
            println(
                """
                name: $name
                level: $level
                score: $ansi_red$score $ansi_white
                kansen: $ansi_yelllo$lives $ansi_white
                status: $status
                """
            )
        } else {
            println("$ansi_white" + "Deze kueze is$ansi_red fout$ansi_white genoteerd")
            name = "LEVEL1"
            lives--
            level++
            status = "${ansi_green}In de kamer waar wapens zijn$ansi_white"
            println(
                """
                name: $name
                level: $level
                score: $ansi_red$score $ansi_white
                kansen: $ansi_yelllo$lives $ansi_white
                status: $status
                """
            )

        }
    }

    fun level2() {

        if (score == 0) {
            var gekozenWapen = Wapen(20)
            println("--------------------level2---------------------\n\n")
            println(
                "Kies een wapen en het kracht van je wapen wordt gebasseerd op je score:\n" +
                        "1-Guns    DAMAGE: ${gekozenWapen.damage}\n"
            )

            println("Typ het nummer vanuit het volgende mogelijkheiden:")
            var wapenKiezen = readLine()!!.toInt()

            while (wapenKiezen != 1) {
                println("$ansi_red" + "Jij hebt het onjuiste nummer gekozen, probeer het nogmaals onpieuw... $ansi_white")
                wapenKiezen = readLine()!!.toInt()
            }

            println("Je hebt Guns gekozen")

            name = "LEVEL2"
            level++
            status = "Wapen Gekozen"
            println(
                """
                name: $name
                level: $level
                score: $score
                kansen: $lives
                status: $status
                """
            )
        } else if (score == 1) {
            var gekozenWapen = Wapen(20)
            println("--------------------level2---------------------\n\n")
            println(
                "Kies een wapen en het kracht van je wapen wordt gebasseerd op je score:\n" +
                        "1-Guns     DAMAGE: ${gekozenWapen.damage}\n" +
                        "2-Pistool  DAMAGE: ${gekozenWapen.damage + 20}\n"
            )


            println("Typ het nummer vanuit het volgende mogelijkheiden:")
            var wapenKiezen = readLine()!!.toInt()

            while (wapenKiezen != 1 && wapenKiezen != 2) {
                println("$ansi_red" + "Jij hebt het onjuiste nummer gekozen, probeer het nogmaals onpieuw... $ansi_white")
                wapenKiezen = readLine()!!.toInt()
            }

            when (wapenKiezen) {
                1 -> println("Je hebt Guns gekozen\n")
                2 -> println("Je hebt Pistool gekozen\n")
            }
        } else {
            var gekozenWapen = Wapen(20)
            println("--------------------level2---------------------\n\n")
            println(
                "Kies een wapen en het kracht van je wapen wordt gebasseerd op je score:\n" +
                        "1-Guns      DAMAGE: ${gekozenWapen.damage}\n" +
                        "2-Pistool   DAMAGE: ${gekozenWapen.damage + 20}\n" +
                        "3-Geweer    DAMAGE: ${gekozenWapen.damage + 40}\n"
            )

            println("Typ het nummer vanuit het volgende mogelijkheiden:")
            var wapenKiezen = readLine()!!.toInt()

            while (wapenKiezen != 1 && wapenKiezen != 2 && wapenKiezen != 3) {
                println("$ansi_red" + "Jij hebt het onjuiste nummer gekozen, probeer het nogmaals onpieuw... $ansi_white")
                wapenKiezen = readLine()!!.toInt()
            }

            when (wapenKiezen) {
                1 -> println("Je hebt Guns gekozen, je gaat deze wapen gebruiken tijdens het vechten tegen de vaijndan\n")
                2 -> println("Je hebt Pistool gekozen\n")
                3 -> println("Je hebt Geweer gekozen\n")
            }
        }
    }


}