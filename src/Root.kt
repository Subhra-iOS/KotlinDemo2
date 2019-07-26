/*
* Main class created By Subhra
* */

@file:JvmName("Root") //Name Annotation

fun main(args : Array<String>){

    var car : Car = Car()
    car.name = "BMW"

    print("New Car Name : ${car.name}\n")

    val num1 = 5
    val num2 = 8
    val greatestNum = car.findGreatestNumber(num1,num2)

    print("Gretaest Number between $num1 and $num2 is $greatestNum \n")

    val newModelName = car.appendCarModelWith("BMW", "Lux1")

    print("New car model name : $newModelName\n")
    print("Car name length is ${car.stringLength(newModelName)}\n")

    val higherOrderCarLength = car.mapStringLenthWith("Android", ({
        it.length
    }))

    print("car length using higher order function : $higherOrderCarLength\n")

    val output = car.checkWithSwitch(8)

    print("When (Switch) output : $output\n")

    car.printLoopWith(Array(5, { i -> i + 1 }))

    var electricCar = ElectricCar(6)

    print("Car Color : ${electricCar.carColor}\n")
    print("Car Color : ${electricCar.numberOfLights}\n")

    val eleCarModel = electricCar.appendCarModelWith("Kia","10i")
    print("New Electric car model : $eleCarModel\n")

    print("Price Set : ${electricCar.creatMap()}\n")

    val carMap = electricCar.creatMap()

    for ((carName, price) in carMap){
        print("Name : $carName -> Price : $price \n")
    }

    val addition = electricCar.addCarPrices(3000,4000)

    print("Total price : $addition\n")
    print("InLine Total : ${electricCar.addInlineCarPrices(3000,8000)}\n")
    print("In Line Max : ${electricCar.max(5,8)} \n")

    val amount = calcAmount(amt = 50, interest = 0.03)
    print("Total amount after tax : $amount")

}

fun maxOut(a : Int, b : Int) : Int = if(a > b) a else b

@JvmOverloads //JVM overload the function i.e creats two functions to encounter JAVA's optional parameter.
fun calcAmount(amt : Int, interest : Double = 0.04) : Int{ //Method over loading in Kotlin by assigning default parameter.
    return  (amt + amt*interest).toInt()
}
