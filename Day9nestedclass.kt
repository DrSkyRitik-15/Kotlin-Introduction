fun main(){
    val obj=Outer.Nested()
    obj.AA()
}
class Outer{
    class Nested{
        fun AA(){
            println("Hello")
            }
            }
}