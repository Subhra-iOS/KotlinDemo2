/*
* Created by Subhra
* */


open class Car {

    open var name : String = "Audi"
    public var listArray : List<Int> = listOf(1,3,4,7,5)

    fun findGreatestNumber(firstNum:Int, secondNum:Int) : Int{

        val num = when { //use when as an expression

            firstNum > secondNum -> { firstNum }
            else -> { secondNum }

        }

        return  num
    }

   open fun appendCarModelWith(carName : String, modelNo : String) : String{

        return  carName + "_" + modelNo
    }

/*
* Anonymous Function
* */
    val stringLength:(String) -> Int = { input ->

        input.length
    }

    /*
    * High order function
    * */

    fun mapStringLenthWith(str : String, map : (String) -> Int) : Int{

        return  map(str)
    }

    /**
     * Switch function
     */

    fun checkWithSwitch(num : Int) : String{

        when(num){

            1 -> return  "One"
            2 -> return  "Two"
            3 -> return  "Three"
            else -> return  "Please give proper input"
        }
    }

    /**
     *
     * For loop
     */

    fun printLoopWith(numbers : Array<Int>){

        print("Array size : ${numbers.size}\n")

        for ((i, a) in numbers.withIndex()){
            print("Loop no $i : $a \n")
        }

    }
}
