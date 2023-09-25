

fun main(){

    // Lamda 선언 방식

    // Parameter O, Return O
    val poro: (Int, Int) -> Int = { a: Int, b: Int -> a+b }
//    val lamda2: (Int, Int) -> Int = { a, b -> a+b }
//     val lamda2 = {a: Int, b: Int -> a+b}

    // Parameter O, Return X
    val porx: (Int, Int) -> Unit = { a,b -> println(a+b) }
//    val porx = { a: Int, b: Int -> println(a+b) }

    // Parameter X, Return O
    val pxro: () -> String = { "No parameter but Return" }

    // Parameter X, Return X
    val pxrx: () -> Unit = { println("No parameter, No Return") }
//     val pxrx = { println("") }


    // Lamda 실행 방식
    poro.invoke(1,2)
    poro(1,2)
    pxrx.invoke()

    reverseString("Hello") { s -> s.reversed() }
    reverseString("Hello") { it.reversed() }
}

fun reverseString(str: String, lamda: (String) -> (String)){
    val result = lamda(str)
    println(result)
}