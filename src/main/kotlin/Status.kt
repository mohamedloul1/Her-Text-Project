open class Status(var name:String, var score:Int = 0, var level:Int = 0, var lives:Int = 3, var status:String = "Vast") {
    var Wapen = Wapen("Fist", 10)

    fun show(){
        println("""
        status: $name
        score: $score
        level: $level
        kansen: $lives
            
        """ )
    }
}