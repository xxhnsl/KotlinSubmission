class Hero {

    private var name: String = "Lizzam"
    private var age = 22
    private var height = 156
    private var health = 100

    fun setProfile(name: String, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("You have died $name")
        }
     }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }

    fun lari() {
        checkHealth()
        println("$name sedang berlari...")
        health -= 2
    }

    fun makan() {
        checkHealth()
        println("$name sedang makan...")
        health += 2
    }

    fun minum() {
        checkHealth()
        println("$name sedang minum...")
        health += 2
    }

    fun lompat() {
        checkHealth()
        println("$name sedang lompat...")
        health -= 2
    }

    fun duduk() {
        checkHealth()
        println("$name sedang duduk...")
        health += 1
    }
}

// Example usage:
fun main() {
    val hero = Hero()
    hero.setProfile("Lizzam", 22, 156)
    hero.profile()

    hero.lari()
    hero.makan()
    hero.minum()
    hero.lompat()
    hero.duduk()

    hero.profile()
}
