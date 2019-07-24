/*
* Main class created By Subhra
* */


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

}