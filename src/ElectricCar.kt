
/**
 * Created by Subhra Roy on 2019-07-28.
 * Copyright © 2019 Subhra Roy. All rights reserved.
 */

import java.util.*

class ElectricCar(val noOfLights : Int) : Car(){

    override var name  = "Kia"

    var carColor : String = "Red"
    private set
    var numberOfLights : Int = noOfLights
    private set

    override fun appendCarModelWith(carName: String, modelNo: String): String {

        return carName + "-e-" + modelNo
    }
    public fun creatMap() : Map<String, Int>{

        var carPriceMap  = TreeMap<String, Int>()
        carPriceMap["Kia10i"] = 5000
        carPriceMap["Kia20i"] = 6000

        return  carPriceMap
    }

    fun addCarPrices(firstPrice : Int, secondPrice : Int) : Int{

        return  firstPrice + secondPrice
    }

    /**
     * In Line function
     */
    fun addInlineCarPrices(firstPrice:Int, secondPrice:Int) : Int = firstPrice + secondPrice
    fun max(a : Int, b : Int) : Int = if(a > b) a else b
}