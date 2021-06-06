class Bakers {

    fun turnOvenOn(){
        println("Yvonne wants to bake")
    }


    fun turnOvenOff(){
        println("Oven is off");
    }


}

fun main(){
    val bake: Bakers? = Bakers()
    try {
        bake?.turnOvenOn()
    }catch (e: BakingException){
        print("Baking experiment failed")
    } finally {
        bake?.turnOvenOff()
    }
}

