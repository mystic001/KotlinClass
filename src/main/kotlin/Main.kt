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


    val zoo = arrayOf(Wolf(),Hippo(),Vehicle())

    println("Execute the zoo function")
    for (anim in zoo){
        anim.roam()
        // Use of is keyword
        if(anim is Animal){
            anim.eat()
            anim.makeNoise()

        }



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


    //testing of is Keyword and some other keywords
    val x = 0
    when(x){
       0->println("x is $x")
        1, 2->println("x is 1 or 2 ")
    else ->{
        println("x is neither 0, 1 nor 2")
        println("x is some other value")
    }

    }

    // How to use when keyword with is .....
    for(roamable in zoo){

        when(roamable){
            is Wolf->{
                println("I am a wolf ${roamable.eat()}")
                //Code to run when animal type is wolf
            }
            is Hippo->{
                println("I am a hippo ${roamable.eat()}")
                //Code to run when animal type is Hippo
            }
            is Animal->{
                println("I am animal pls let me be i dont want to be specific")
                //Code to run when animal type is animal
            }
        }
    }

}