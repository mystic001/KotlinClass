fun main(){
    val r = arrayOf(Rectangle(1,1),Rectangle(1,1),
    Rectangle(1,1),Rectangle(1,1))
    for(x in 0..3){
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}")
        println(" It is ${if(r[x].isSquare) {
            ""
        } else {
            "not "
        }
        } a square")
    }

//Hippo affair
    val hippo = Hippo();
    hippo.sleep()
    hippo.makeNoise()
    hippo.eat()


    val zoo = arrayOf(Wolf(),Hippo())

    println("Execute the zoo function")
    for (anim in zoo){
            anim.eat()
            anim.roam()
    }
    val animal: Animal = Wolf()
    //Wolf affair
    val wolf = Wolf()
    wolf.makeNoise();
    wolf.eat()
    animal.eat()

    //Shot giving to the animal

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}