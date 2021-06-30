open class Enemy(val name:String, var health: Int, var lives: Int) {

     open fun takeDamage(damage: Int) {
        val remainingHealth = health - damage
        if(remainingHealth > 0){
            health = remainingHealth
            println("$name took $damage points of damage and has $health health left")
        } else {
           lives -= 1
            println("$name lost a life")
        }
    }

    override fun toString(): String{
        return "Name: $name, Health: $health, lives: $lives"
    }
}