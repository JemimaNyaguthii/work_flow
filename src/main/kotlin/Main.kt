fun main() {
    oddNumbers()
   println(  things(arrayOf("music","flowers","pen","nature","cup")))
    serving(20)
    multiples()


}


//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers() {
    for (a in 1..100) {
        if ( a%2 != 0) {
            println(a)
        }
//    if num is divisible by 2,we print num is 0
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun things(name:Array<String>):Int{
    var myThings=0
         for(num in name)
             if (num.length > 5){
                 ++myThings
             }
    return myThings

    }
//    You are creating a robot to serve drinks at a party. The robot is required to
//    serve a glass of milk for guests under the age of 6. For guests under the age of
//    15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//    else gets a bottle of coca cola. Create a function that will make these
//            decisions, printing out the name of the drink each person gets according to
//    their age.
fun serving(age:Int) {
    when (age) {
        in 1..6 -> println("glass of milk")
        in 7..14 -> println("botte of fanta")
        else -> println("bottle of coca cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun multiples() {
    for (b in 1..100) {
        if (b%3==0) {
            println("Fizz")
        }
        else if (b%5==0){
            println("Buzz")
        }
        else if (b % 3 == 0 || b % 5 == 0) {
                println("FizzBuzz")
            }
        else{
            println(b)
        }
        }



    }





      











