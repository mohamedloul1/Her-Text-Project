/*fun main(args: Array<String>) {
    val joshua = Player("Joshua",100,0)

    joshua.show()

    val blaster = Weapon("Blaster",45)

//    println(joshua.weapon.name)
//    println(joshua.weapon.damage)

    joshua.weapon = blaster

//    println(joshua.weapon.name)
//    println(joshua.weapon.damage)

    val joey = Player("Joey",100,10)

    val wokpan = Weapon("Wokpan",30)

    joey.weapon = wokpan

    joshua.weapon = joey.weapon

//    println(joey.weapon.name)

    joshua.health = 150
    joshua.show()


}*/

fun main(args: Array<String>){

    val broski = Enemy("Broski",15,9)
    println(broski)

    broski.takeDamage(50)
    println(broski)

    val droid = Droid("Droid", 50,2)
    println(droid)

    droid.takeDamage(48)
    println(droid)

}
