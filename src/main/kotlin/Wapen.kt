class Wapen(val name: String, var damageInflicted: Int) {

    override fun toString(): String {
        return "$name damaged $damageInflicted point of damage"
    }
}