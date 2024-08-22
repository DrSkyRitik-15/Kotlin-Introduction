import java.util.*;
fun main(){
    val totalAmount=270;
    val membership=true;
    
 
    if(totalAmount>=1000 && membership)
    {
        println("Customer having 20% discount")
    }
    else if(totalAmount< 1000 && membership)
    {
        println("Customer having 10% discount")
    }
    else
    {
        println("Customer having no discount")
    }
}