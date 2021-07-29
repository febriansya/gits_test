package aplikasi_konversi_jam

import kotlin.concurrent.timer


fun main() {

    print("masukan jam = ")
    val jam = readLine().toString()
    print("masukan menit =  ")
    val menit = readLine().toString()
    print("masukan detik  = ")
    val detik = readLine().toString()

    println("""
        1. AM
        2. PM
    """.trimIndent())
    print("pilih format : ")
    val format = readLine()?.toInt()

    when{
        format == 1 -> println(if (jam.toInt() > 12){
          val hasilpm = jam.toInt()-12
            println("$hasilpm : $menit : $detik")
        }else{
            println("$jam : $menit : $detik")
        })
        format == 2 -> println(if (jam.toInt()> 12) {
            val hasilpm = jam.toInt()-12
            println("$hasilpm : $menit : $detik")
        }else{
            println("$jam : $menit : $detik")
        })
    }
}


