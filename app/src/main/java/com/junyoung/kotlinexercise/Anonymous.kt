
fun main(){

    // 기본 형식
    // val variableName: (DataType1, DataType2) -> ReturnType = fun(parameter1, parameter2): ReturnType { methodBody }
    // val add: (Int, Int) -> Int = fun (a,b): Int { return a+b }
    // val add = fun...

    val add = fun(a: Int,b: Int): Int { return a+b }
    // Method Body가 단일이면 Return {} 생략 가능.
    val add2 = fun(a: Int, b: Int): Int = a+b

    // Error
//    println(add)
    println(add(1,2))
    println(add.invoke(1,2))

    // Parameter O, Return O
    val poro = fun(a: Int, b: Int): Int = a*b
    println(poro.invoke(2,3))

    // Parameter O, Return X
    val porx = fun(a: Int, b: Int): Unit {println("a : $a, b : $b")}
    porx.invoke(3,4)

    // Parameter X, Return O
    val pxro = fun(): String = "Test"
    println(pxro)

    // Parameter X, Return X
    val pxrx = fun(): Unit { println("no Return") }
    pxrx.invoke()
}