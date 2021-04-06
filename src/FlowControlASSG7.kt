fun main() {
    isOdd()
     Names("Chair","Girl","collins","Table","Woman")
    Robot(5)
    Numbers()



}
fun isOdd(){
    for (num in 1..100)
        if (num%2!=0){
            println(num)
    }

}
fun Names(x:String,Z:String,j:String,k:String,l:String):Array<String>{
    var jina= arrayOf(x,Z,j,k,l)
    for (m in jina)
        if (m.length>=5){
            println(m)
        }
    return jina
}

fun Robot(age:Int){
    if (age<6 ){
        println("Milk")
    }
    else if (age <15 && age>6){
        println("Fanta")
    }else{
        println("Cocacola")}

}

fun Numbers(){
    for (nums in 1..100){
        println(nums)}
    for (nums in 1..100){
        if (nums%3==0){
            println("Fizz")}
    }
    for (nums in 1..100){
        if (nums%5==0){
            println("Buzz")}
    }
    for (nums in 1..100){
        if (nums%5==0 && nums%3==0){
            println("FizzBuzz")
        }
    }

}

    
