 fun main(args: Array<String>) {
    val objChild=Child()
    objChild.myMethod()
    objChild.myMethod2()

}
open class Parent {
    var name:String=" "
    init{
        println("Parent class constructor called")
    }
    fun myMethod()
    {
        println("I am Parent")
    }

}
class Child:Parent()
{
    val name2:String=""
    init{
        println("Child class constructor called")
    }
    fun myMethod2(){
        println("I am Child")
    }
    }
  