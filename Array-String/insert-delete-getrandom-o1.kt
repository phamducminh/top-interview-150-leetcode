import kotlin.random.Random

class RandomizedSet() {
    val hashSet = mutableSetOf<Int>()

    fun insert(`val`: Int): Boolean {
        if (!hashSet.contains(`val`)) {
            hashSet.add(`val`)
            return true
        }
        return false
    }

    fun remove(`val`: Int): Boolean {
        if (hashSet.contains(`val`)) {
            hashSet.remove(`val`)
            return true
        }
        return false
    }

    fun getRandom(): Int {
        val random = Random.nextInt(0, hashSet.size)
        return hashSet.elementAt(random)
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */