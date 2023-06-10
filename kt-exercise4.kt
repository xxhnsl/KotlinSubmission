package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

fun divideNumbers(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}

fun handleDivision() {
    try {
        val result = divideNumbers(10, 2)
        println("Hasil: $result")
    } catch (e: Exception) {
        println("Error: ${e.message}")
        println("Terjadi kesalahan selama pembagian.")
    }
}
handleDivision()
}