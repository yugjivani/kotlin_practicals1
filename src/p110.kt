open class Car(var model:String){
    var price:Double = 0.0
}
class Suzuki(m: String):Car(m){
 constructor(m: String,p: Double):this(m){
price=p
 }
}
fun main()
{
    val car = Suzuki("BMW",10000.0)
    println(car.model)
    print(car.price)
}