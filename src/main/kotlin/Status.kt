open class Status(var name:String, var score:Int = 0, var level:Int = 0, var lives:Int = 3, var status:String = "Vast", var hp:Int = 100, var wapen_naam: String = "Wapen") {

    fun show(){
        println("""
        status: $name
        score: $score
        level: $level
        kansen: $lives
            
        """ )
    }
}