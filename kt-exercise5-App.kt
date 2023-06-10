//Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
class Hero {

    private var name: String = "Lizzam"
    private var age = 22
    private var height = 156
    private var health = 100
//Set data profile dengan memanggil fungsi setProfile() dibawah ini
//Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
    fun setProfile(name: String, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }
//Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }
//Challenge: Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
///Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
    private fun checkHealth() {
        if (health <= 0) {
            println("You have died $name")
        }
     }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1 * 5
    }

    fun lari() {
        checkHealth()
        println("$name sedang berlari...")
        health -= 2 * 4
    }

    fun makan() {
        checkHealth()
        println("$name sedang makan...")
        health += 2 * 4
    }

    fun minum() {
        checkHealth()
        println("$name sedang minum...")
        health += 2 * 4
    }

    fun lompat() {
        checkHealth()
        println("$name sedang lompat...")
        health -= 2 * 3
    }

    fun duduk() {
        checkHealth()
        println("$name sedang duduk...")
        health += 1 * 2
    }
}

// Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
fun main() {
    val hero = Hero()
    hero.setProfile("Lizzam", 22, 156)
    hero.profile()

    hero.jalan()
    hero.lari()
    hero.makan()
    hero.minum()
    hero.lompat()
    hero.duduk()

    hero.profile()
}