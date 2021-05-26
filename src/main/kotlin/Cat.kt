class Cat(var name : String? = "") {

    fun Meow(){
        println("Meow")
    }
}

//This is for an activity in cahpter 8
fun main(){
    val container = arrayOf(Cat("Misty"),null,Cat("Socks"))

    for(x in container){

        if(x != null ){
            print("${x.name} ")
            x.Meow()
        }

      }
}