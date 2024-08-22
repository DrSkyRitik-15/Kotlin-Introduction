fun main(){
    val fruit= listOf("Apple","Banana","Cherry")
    
    for( i in fruit)
    {
        println("Fruit name is : $i")
    }
    
    val phal = listOf("Apple","Bannna","Cherry")
    
    for(i in phal.indices)
    {
        println("Fruit at index $i, ${phal[i]}")
    }
    
    
    }
