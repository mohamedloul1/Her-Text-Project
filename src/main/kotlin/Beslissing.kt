import java.util.logging.Level
import kotlin.system.exitProcess

class Beslissing:Status( "LEVEL1",health = 100) {


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

    //level 1B
    open fun level1() {
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
        }
        else if(level1 == "hamer") {
            var player = Status("$name",score,1,lives,status,100)
            var enemy = Enemy("Crusher",100,0)
            var hamer = Wapen("hamer",50)
            println("wowww goed gedaan!")
            name = "LEVEL1"
            level++
            score++
            status = "${ansi_green}In de kamer waar wapens zijn$ansi_white"

            player.Wapen = hamer
            player.show()





            println("je hebt nu een enemy voor je, je moet hem dood maken,")
            println("met wat ga je hem dood maken??")
            println("gebruik je hamer zodat je kan hem dood maken")
            println("type gewoon ${ansi_blue}hamer $ansi_white om de enemy dood te maken")

            var input = readLine()
            while (input != "hamer"){
                println("je hebt niet hamer goed getypt of iets anders is fout gegaan")
            }
            enemy.takeDamage(50)
            println(enemy)

            println("${ansi_red}nu heeft de enemy jou gedamaged$ansi_white")
            player.takeDamage(50)
            player.show()

            println("nu moet je alleen 1 keer meer slaan")
            println("type $ansi_blue hamer $ansi_white")

            input = readLine()
            while (input != "hamer"){
                println("je hebt niet hamer goed getypt of iets anders is fout gegaan")
                input = readLine()
            }

            player.score = 64
            player.show()
            println("je hebt de enemy dood gemaakt")
            println("nu je kan een nieuwe wapen krijgen, kies je wapen $ansi_white pistool of $ansi_white blaster")


            var pistool = Wapen("Pistool",30)
            var blaster = Wapen("blaster",40)

            input = readLine()

            if (input == "pistool"){
                player.Wapen = pistool
            }
            else if (input == "blaster"){
                player.Wapen = blaster
            }
            else{
                println("je heb geen goede wapen gekozen of iets heeft fout gegaan")
            }
            println("nu ga je naar level 2")
            level++
            player.show()

        }
        else {
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
            var gekozenWapen = Wapen("sleutel",20)
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
            var gekozenWapen = Wapen("hamer",20)
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
        }else {
            var gekozenWapen = Wapen("",20)
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

    open fun level2en2(){

        var pistool = Wapen("Pistool",30)
        var blaster = Wapen("blaster",40)

        val bigenemy = BigEnemy("Codaster",120,1)
        var player = Status("$name",score,level,lives,status,50)
        player.level = 2
        player.score = 64

        player.Wapen = blaster
        println("nu ben je bij level 2")
        println("je hebt nu naar een big boss (big enemy gegaan), je moet heb ook dood maken")
        println("maar nu je hebt een blaster, je zou hem sneller dood maken")
        println("de enemy komt nu bij jouw shiet hem")
        println("type je wapen (blaster) om hem dood te maken")
        var input = readLine()

        while (input != "blaster"){
            println("je hebt niet een goede wapen getypt of iets is fout gegaan")
            input = readLine()
        }

        println("je hebt de enemy gedamaged")
        bigenemy.takeDamage(40)

        println("${ansi_red}hij heeft jou nu gedamaged$ansi_white")
        player.takeDamage(45)
        player.show()

        println("lets go je kan hem dood maken")
        println("maak hem dood met je hamer , sla hem 2 keer")

        input = readLine()
        while (input != "blaster"){
            println("je hebt niet goed getypt of iets is fout gegaan")
        }
        println("oooof, je hebt hem hard geslaan")
        bigenemy.takeDamage(80)


        input = readLine()
        while (input != "blaster"){
            println("je hebt niet goed getypt of iets is fout gegaan")
        }
        bigenemy.takeDamage(80)

        player.level = 2
        player.score = 98
        player.show()

        println("nice je hebt de enemy dood gemaakt, goede werk player, hopelijk speel je nog een keer, goodluck with life!!")
        exitProcess(0)
    }



}