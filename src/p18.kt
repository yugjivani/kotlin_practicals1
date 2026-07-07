fun main(){
    val a1 = Array<Int>(3){0}
    val a2 = Array<Int>(20){i->i*2}
    a1.sort()
    a2.shuffle()
    println(a1.joinToString())
    println(a2.joinToString())
}
