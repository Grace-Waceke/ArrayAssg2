fun main() {
    var x=sumInts(arrayOf(10.0, "Grace", true, 9, 4.6))
    println(x)
    var y= product(arrayOf(40, 30, 50, 60))
    println(y)
    var z= align(arrayOf('a', 'd', 'c','b', 'e', 'g','r', 'i','z', 'o', 'u'))
    println(z)
}
fun sumInts(call: Array<Any>): Double{
    var sum=0.0
    call.forEach{ nor ->
        if(nor is Double){
            sum+= nor
        }
    }
    return sum
}
   fun product(numbers: Array<Int>): Int{
       var total=1
       numbers.forEach{ can ->
           total*=can

       }
return total
}
fun align(words: Array<Char>):Int {
    var vowels=0
    words.forEach{ let->
       if(let =='a'|| let =='e'||  let=='i'|| let=='o'|| let=='u'){
           vowels++
           }

        }
          return vowels
}














