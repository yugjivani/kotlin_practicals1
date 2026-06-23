fun main() {
    var i = 10
    var j = 20
    var k = 30.5f
    var l = 40L
    var m: Short = 50
    var n: Byte = 60
    var o = 'A'
    var p = true
    var q = "Hey"
    var r = 20.5
    var x = 100

    j = 200
    x = 300

    println("i=$i, j=$j")
    println(k)
    println("k %.2f, r %.1f".format(k, r))
    System.out.printf("l=%d, m=%d, n=%d%n", l, m, n)
    println("""
        Character: $o
        Boolean: $p
        String: $q
    """.trimIndent())
    println("x=" + x)
}