open class Status(var name:String, var score:Int = 0, var level:Int = 0, var lives:Int = 3,
                  var status:String = "Vast",var health:Int)
     {
    var Wapen = Wapen("Hand", 10)

    fun show(){
        println("""
        status: $name
        score: $score
        level: $level
        kansen: $lives
        wapen: ${Wapen.name}
        status: $status
            
        """ )
    }

     open fun takeDamage(damage: Int) {
         val remainingHealth = health - damage
         if(remainingHealth > 0){
             health = remainingHealth
             println("$name heb $damage punt van damage gekregen en heb $health health nog")
         } else {
             lives -= 1
             println("$name een leven verloren")
         }
     }

     override fun toString(): String{
         return "Name: $name, Health: $health, lives: $lives"
     }
}