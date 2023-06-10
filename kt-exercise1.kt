package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    
    val namaDepan:String = "Lizzam"
    println("Nama Depan: $namaDepan")
    
    val namaBelakang:String = "Sekar"
    println("Nama Belakang: $namaBelakang")
    
    val umur:Int = 22
    println("Umur: $umur")
    
    val single:Boolean = true
    println("Status: $single")
    

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

	val groupId:Int = 4
    println("Group ID: $groupId")
    
    val groupMember = listOf("Lizzam", "Desy", "Rizki", "Ari", "Desy", "Eunike")
    println("Group Member: $groupMember")
    
    val session: String = "Afternoon Session"
    println("Session: $session")
    
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val groupMembers = listOf("Lizzam", "Rizki", "Desy", "Eunike", "Ari",)
    
    val myName = "Lizzam"
    val myIndex = groupMembers.indexOf(myName)
    println("My name: $myName")
    
    if (myIndex != -1) {
    val myGroupMember = groupMembers[myIndex]
        
    return "My group member is $groupMembers"
} else {
    return "My name is not found in the group"
}
    println(myGroup())

}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5
    val totalMembers = mentor.size + countOfGroup
    return totalMembers

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(4, listOf("Lizzam", "Rizki", "Desy", "Eunike", "Ari"), "Afternoon")
    
    val groupId:Int = 4
    val groupMembers = listOf("Lizzam", "Rizki", "Desy", "Eunike", "Ari",)
    val session: String = "Afternoon Session"

}