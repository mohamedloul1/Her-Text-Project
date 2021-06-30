class BigEnemy(name:String, health: Int, lives: Int) : Enemy(name, health, lives) {

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}