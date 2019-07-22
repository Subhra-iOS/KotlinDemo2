/*
* Main class created By Subhra
* */


fun main(args : Array<String>){

    var car : Car = Car()
    car.name = "BMW"

    val modelName = car.addNewCarName("BMW", "LX1")
    val num1 = 5
    val num2 = 8
    val greatestNum = car.checkGreatestNumber(num1, num2)

    print("New Car Name : ${car.name} \n")
    print("New Model Name : $modelName \n")
    print("Greatest between $num1 and $num2 is $greatestNum")

}