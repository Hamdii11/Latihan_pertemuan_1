fun main() {
    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}
//Karakter di Kotlin ditandai dengan memberikan single quotes pada nilai sebuah variabel.
//Karakter di Kotlin tidak bisa diperlakukan secara langsung sebagai Number.
//Character di Kotlin adalah sebagai objek yang memiliki fungsi anggota seperti isLowerCase(),
//isDigit(),toUpperCase(), toLowerCase(), toString() dan lainnya