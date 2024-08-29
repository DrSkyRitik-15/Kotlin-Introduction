fun main(){
    val obj=Outer().Inner();

    println(obj.AA())
}

class Outer{
    private val welcomeMeaasge:String ="Welcome to Lpu"
   inner class Inner{                               // inner must be their
        fun AA()=welcomeMeaasge
    }
    
    
    }