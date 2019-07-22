/*
* Created by Subhra
* */


class Car {

    var name : String = "Audi"

    fun addNewCarName(carName : String, modelName : String) : String {

        return  carName + "_" + modelName

    }

    fun checkGreatestNumber(firstNum : Int, secondNum : Int) : Int{

        val number = when {

            (firstNum > secondNum) -> { firstNum }
            else -> { secondNum }
        }

        return  number
    }

}