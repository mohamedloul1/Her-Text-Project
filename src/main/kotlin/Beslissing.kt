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
    }    }