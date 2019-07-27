/**
 *
 */

class Developer {
    var skills : String? = null

    fun findFactorialOf(num : Int) : Int{

        if (num < 1){
            return 1
        }else {
            return num * findFactorialOf(num - 1)
        }
    }
}

/**
 * Extension : infix function can take only one parameter
 * */

// infix fun Developer.plus(dev : Developer) : Developer{
//
//    var newDev = Developer()
//    newDev.skills = this.skills + " " + dev.skills
//
//    return  newDev
// }

operator fun Developer.plus(developer : Developer) : Developer{
    var newDev = Developer()
    newDev.skills = this.skills + " " + developer.skills

    return  newDev
}
//Primary constructor
class Human(var humanName : String){

    private  var name : String = ""

    init {
        name = humanName
        print("Human is here\n")
    }

    fun showName() : String = name
}

//Secondary Constructor
open class DevHuman(var name : String){

   open var devAge : Int = 0
    var devName : String = ""

    constructor(age : Int, _name : String) : this(_name){
        this.devAge = age
    }

    fun show() : String = this.name + " " + this.devAge
    open fun thik(){
        print("Start thiking in Java\n")
    }
}

/**
 * In java/kotlin/swift this can never occur as there is no multiple inheritance.
 * Here even if two interfaces are going to have same method, the implementing class will
 * have only one method and that too will be done by the implementer. Dynamic loading of classes makes
 * the implementation of multiple inheritance difficult
 * we can consider diamond problem of multiple inheritance.
 *
 * We have two classes B and C inheriting from A. Assume that B and C are overriding an
 * inherited method and they provide their own implementation. Now D inherits from both B and C doing multiple inheritance.
 * D should inherit that overridden method,
 * which overridden method will be used? Will it be from B or C? Here we have an ambiguity.
 */
//Inheritance
//By default all classes, variables and functions are final
class ARCDev(name : String) : DevHuman(age = 0 ,_name = name){
   override var devAge = 3000

    override fun thik() {
        super.thik()
        print("Start thiking in Kotlin now")
    }

}

/**
 * Abstract Class
 * */
abstract class Doctor{
    abstract fun think()
    open fun talk(){
        print("Doc talk about op")
    }
}

class Surgeon : Doctor(){
    override fun think() {
        print("Think about patient\n")
    }

    override fun talk(){
        print("Talk for options\n")
    }

}

/**
 * Interface
 * */
interface A{
    fun show()
    fun pause(){
        print("Pause in A Interface\n")
    }
}

interface B{
    fun display()
    fun pause(){
        print("Pause in B Interface\n")
    }
}

class C : A, B{

    override fun pause() {
        super<B>.pause()
    }

    override fun show() {
        print("Show Insterface\n")
    }

    override fun display() {
        print("Display Insterface\n")
    }

}

/**
 * Data Class
 * */

// 1. Every Class needs toString() function
// 2. Need to override equals and hashCode function
// 3. copy function

data class Laptop(val machineName : String,val price : Int){

    fun show(){
        print("Awesome machine.....")
    }

}

/**
 * Object Class : Singleton class
 * */

data class Book(var bookName : String, var price : Int)

object BookShelf{
    var books = arrayListOf<Book>()

    fun showBooks(){
        for (book in books){
            print("$book\n")
        }
    }
}