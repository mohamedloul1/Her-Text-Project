enum class LootType {
    POTION, ARMOR, MAGIC
}

class Loot(val name:String, val lootType: LootType, val value:Double) {

}