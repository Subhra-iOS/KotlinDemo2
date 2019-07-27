/*
* Main class created By Subhra
* */

@file:JvmName("Root") //Name Annotation

import com.sun.jdi.IntegerValue
import java.lang.NumberFormatException
import java.util.*

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
    print("Total amount after tax : $amount\n")

    var digit : String = "100abc"
    var numericDigit : Int = 0

    try {
        numericDigit = digit.toInt()
    }catch (exception : NumberFormatException){
        print("Give a proper input.\n")
    }

    /**
     * try @ kotlin : try as an expression
     */

    var digitUpdate : Int = try {
        digit.toInt()
    }catch ( e : NumberFormatException){
        -1
    }

    digitUpdate++

    print("Output after exception check : $digitUpdate\n")

    var dev1 = Developer()
    dev1.skills = "Swift"

    var dev2 = Developer()
    dev2.skills = "Kotlin"

    //var dev3 = dev1 plus dev2

   // print("New Developer skills are : ${dev3.skills} \n")

    var dev4 = dev1 + dev2

    print("Operator overloading skills are : ${dev4.skills} \n")
    val factValue = dev4.findFactorialOf(5)
    print("Factorial of 5 : $factValue \n")

    val human = Human(humanName = "Subhra")
    print("Human name is ${human.showName()} \n")

    val devHuman = DevHuman(age = 2920,_name = "Subhra")
    print("Human name is ${devHuman.show()} \n")

    val inheriteDev = ARCDev(name = "Subhra")
    print("Now dev becomes : ${inheriteDev.show()}\n")
    inheriteDev.thik()

    val surgeon = Surgeon()
    surgeon.think()
    surgeon.talk()

    val cObj = C()
    cObj.show()
    cObj.pause()
    cObj.display()

    //data class
    var lap1 = Laptop("HP",900)
    var lap2 = Laptop("HP",900)

    var lap3 = lap2.copy(price = 1000)

    print("${lap1.equals(lap2)}\n")
    print("Lap3 : $lap3\n")

    //Object keyword
    BookShelf.books.add(Book("Swift",100))
    BookShelf.books.add(Book("Kotlin",150))
    BookShelf.books.add(Book("Java",40))

    BookShelf.showBooks()
}

fun maxOut(a : Int, b : Int) : Int = if(a > b) a else b

@JvmOverloads //JVM overload the function i.e creats two functions to encounter JAVA's optional parameter.
fun calcAmount(amt : Int, interest : Double = 0.04) : Int{ //Method over loading in Kotlin by assigning default parameter.
    return  (amt + amt*interest).toInt()
}
