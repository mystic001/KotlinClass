open class Animal {
    open var image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise(){
        println("The animal is making noise")
    }

    open fun eat(){
        println("The animal is eating")
    }

    open fun roam(){
        println("The animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}


