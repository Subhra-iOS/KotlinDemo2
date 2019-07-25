/**
 *
 * Created by Subhra
 */


class ElectricCar(val noOfLights : Int) : Car(){

    override var name  = "Kia"

    var carColor : String = "Red"
    private set
    var numberOfLights : Int = noOfLights
    private set

    override fun appendCarModelWith(carName: String, modelNo: String): String {

        return carName + "-e-" + modelNo
    }

}