package aplikasi_hello_world

fun main() {

    var a = true
        fun get() {
                print("masukan angka favorite anda : ")
                val save = readLine()?.toInt()

                if (save!! % 3 == 0) {
                    println("Hello")
                } else if (save!! % 5 == 0) {
                    println("World")
                } else if (save!! % 5 == 0 && save!! % 3 == 0) {
                    println("hello world")
                }else{
                    println("coba lagi")
                }
        get()
    }
}