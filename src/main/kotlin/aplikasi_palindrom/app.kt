package aplikasi_palindrom

fun main() {
        print("masuka kata : ")
        val myString = readLine().toString()
        if (myString.reversed() == myString){
            println("kata  $myString is palindrome")
        }else{
            println("kata tidak palindrome")
        }
}