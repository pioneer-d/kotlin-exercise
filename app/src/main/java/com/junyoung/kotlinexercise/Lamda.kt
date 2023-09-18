

fun main(){
    val lamda1 = { println("lamda Test") }
    lamda1()
    lamda1.invoke()

    val lamda2: (Int, Int) -> Int = { a: Int, b: Int -> a+b }
//    val lamda2: (Int, Int) -> Int = { a, b -> a+b }
    // val lamda2 = {a: Int, b: Int -> a+b}
}