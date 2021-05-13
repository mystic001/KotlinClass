import java.util.*

class Dog(val name: String, weight_param: Int, breed_param: String) {
    //declaring properties within the class vody
    private var breed = breed_param.uppercase(Locale.getDefault())
    init {
        print("Dog $name has been created with a breed $breed")
    }
    var activities = arrayOf("Walk", "Talk")
    val weightInKg : Double
    // creating a getter and setter
    get() = weight/2.2
    var weight = weight_param
//How to create a setter
    set(value){
        if(value > 0) field = value
    }
 }