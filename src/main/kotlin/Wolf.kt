class Wolf:Canine() {
    override val image = "wolf.jpg"
    override var food = "meat"
    override var habitat = "forests"

    override fun makeNoise() {
       println("Hoooooooooow!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}