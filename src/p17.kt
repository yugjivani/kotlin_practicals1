fun main() {
    println("Enter your Number:")
    val number = readln().toInt()
    val result = fact(number)
    println("Factorial of $number is: $result")
}
fun fact(n: Int): Int {
    if (n <= 1) {
        return 1
    }
    return n * fact(n - 1)
}
