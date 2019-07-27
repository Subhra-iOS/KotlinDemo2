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
class DevHuman(var name : String){

    var devAge : Int = 0
    var devName : String = ""

    constructor(age : Int, _name : String) : this(_name){
        this.devAge = age
    }

    fun show() : String = this.name + " " + this.devAge
}