fun main(){
    println("Enter your 1st Number:")
    val num1 = readln().toInt()
    println("Enter your 2nd Number:")
    val num2 = readln().toInt()
    println(add(num1, num2))
    println(multiply(num1, num2))
    println(subtract(num1, num2))
    println(divide(num1, num2))
}
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2
}
fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2
}
fun divide(num1: Int, num2: Int): Int {
    return num1 / num2
}