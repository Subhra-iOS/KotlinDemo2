
/**
 * Created by Subhra Roy on 2019-07-28.
 * Copyright © 2019 Subhra Roy. All rights reserved.
 */

import java.io.BufferedInputStream
import java.util.*
import java.util.function.Consumer

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

    dynamicList.forEach({
        //print("$it\n")
        println(it)
    })

    var consumer : Consumer<Int> = object  : Consumer<Int>{
        override fun accept(p0: Int) {
            println(p0)
        }
    }

    dynamicList.forEach(consumer)

    val evenList = dynamicList.filter { it%2 == 0 }
    println(evenList)
    val doubleEvenList = evenList.map { it*2 }
    println(doubleEvenList)

    val evenDoubleList = dynamicList.filter { it%2>0 }.map { it*3 }
    println(evenDoubleList)
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