fun main(){
    println("Enter your Number:")
    val num = readln().toInt()
    println(if (num % 2== 0)
    {"even number"
    }
    else
    {
        "odd number"
    })
}