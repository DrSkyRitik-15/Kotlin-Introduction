//primary   likke java
//Secondary   declare inside the class
class Person(val name:String)
{
    // member varable
    // var name:String

    //Initialize Blocks

    init{
        println("init block")
    }
    init{
        println("2  init block")
    }
    init{
        println("3  init block")
    }
    init {
        // this.name=name
        println("Name = $name")
    }
}
fun main(){
    val person=Person("Rahul")
}