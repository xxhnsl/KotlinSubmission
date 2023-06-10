package id.infinitelearning.KotlinSubmission.exercise2

/** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    // 

fun main() {
    
    val bilGenap = mutableListOf<Int>()

for (num in 1..100) {
    if (num % 2 == 0) {
        bilGenap.add(num)
    }
}

// Daftar bilangan genap
println(bilGenap)

}
