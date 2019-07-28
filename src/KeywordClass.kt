
/**
 * Companion object (suitable to replace static key word for JAVA)
 */
import java.io.BufferedInputStream
import java.util.*

class ClassA{
    companion object{
        @JvmStatic // using this keyword (java annotation) would make the function put static behaviour
        fun show(){
            print("Hello Static for Kotlin\n")
        }
    }
}

fun main(args : Array<String>){
    ClassA.show()
    var obj1 = FactA.create()
    obj1.live()

    /*
    * User input
    * */
/*
    var scannerInput = Scanner(System.`in`)
    val inputNumber = scannerInput.next()

    print("User input : $inputNumber")*/

   /* var input = readLine()
    print(input)*/

    var listValues : List<Int> = listOf<Int>(3,5,4,1,6) // Static list
    var dynamicList : MutableList<Int> = mutableListOf(3,5,4,1,6) //Dynamic list
    dynamicList.add(3,10)

}

/**
 * Factory pattern with companion object
 * */

class FactA{

    companion object{
        fun create() : FactA = FactA()
    }

    fun live(){
        print("Go live \n")
    }
}