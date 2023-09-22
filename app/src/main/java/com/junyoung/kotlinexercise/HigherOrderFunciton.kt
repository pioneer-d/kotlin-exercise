
fun main(){

    val add = {a: Int, b: Int -> a+b}

    hof(add)
    hof( {a: Int, b: Int -> a+b} )
    hof {a: Int, b: Int -> a+b}

    hof2("test", add)
    hof2("test") {a: Int, b: Int -> a+b}

    // it
    // 람다식에서 하나의 parameter만 있으면, 이때 it 키워드를 사용할 수 있다.
    hof3{
        println(it)
    }

    // it 예제 2
    val numbers = listOf(1,2,3,4,5)
    println(numbers.filter {numbers -> numbers > 3})
    println(numbers.filter { it > 3 })
}

// 람다를 매개변수로 받는다?
fun hof(addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println(result)
}



fun hof2(name: String, addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println("Hello $name"+ result)
}

//
fun hof3(name: (String) -> Unit){
    name("test")
}