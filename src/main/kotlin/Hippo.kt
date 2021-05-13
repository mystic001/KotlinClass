

//To make a class inherit from another, you add a colon (:) to the class header followed by the name of the superclass.
class Hippo: Animal() {
    override var image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    init {
        image = "hippo.jpg"
    }
    //So to make use of the makeNoise method i need to overide it
    override fun makeNoise(){
        println("Grunt! Grunt")
    }

    override fun eat() {
        println("The Hippo is eating food")
    }

    override fun roam() {
        println("The Hippo is wandering")
    }

}