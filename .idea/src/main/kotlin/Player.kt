class Player(val name:String, var health: Int = 100, var lives: Int = 10) {
    var weapon = Weapon("Fist", 10)

    fun show() {
        if (health < 0) {
            println("$name is dead")

        }else {
            println("$name is alive")
        }
    }

    override fun toString(): String {
        return """
            name:   $name
            health: $health
            score:  $lives
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
            """
    }


}