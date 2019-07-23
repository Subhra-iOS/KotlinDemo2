/*
* Created by Subhra
* */


class Car {

    var name : String = "Audi"

    fun findGreatestNumber(firstNum : Int, secondNum : Int) : Int{

        val num = when {

            firstNum > secondNum -> { firstNum }
            else -> { secondNum }

        }

        return  num
    }

    fun appendCarModelWith(carName : String, modelNo : String) : String{

        return  carName + "_" + modelNo
    }

/*
* Anonymous Function
* */
    val stringLength:(String) -> Int = { input ->

        input.length
    }
}