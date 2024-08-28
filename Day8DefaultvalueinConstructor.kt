fun main(){
     val emp=Apple(18018,"Ritik")
     //default value for emp
     val emp1=Apple(11011)
    //  default vlaue for both parameter
    //because no argument passed

    val emp3=Apple();
}
class Apple(emp_id: Int=100,emp_name:String="Rk"){
    val id:Int
    var name:String
    // init block
    init{
        id=emp_id
        name=emp_name

        println("Employee id is :$id ,")
        println("Employee name is :$name")
        println();
    }
}