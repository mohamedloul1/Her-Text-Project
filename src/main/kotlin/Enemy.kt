open class Enemy(val name:String, var health: Int, var lives: Int) {

    open fun takeDamage(damage: Int) {
        val remainingHealth = health - damage
        if(remainingHealth > 0){
            health = remainingHealth
            println("$name heeft $damage punt van damage gekregen en heeft $health health nog")
        } else {
            lives -= 1
            println("$name een leven verloren")
        }
    }

    override fun toString(): String{
        return "Name: $name, Health: $health, lives: $lives"
    }
}