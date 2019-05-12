fun main() {
    printHello()
    basicOperation()
    conditionalStatement()
    helloArrays()
}

/* print Hello Kotlin */
fun printHello() {
    println("Hello Kotlin")

}

/*
 *
 *  Solve the following using the operator methods in one line of code.
 *  If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
 *  and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel,
 *  how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
 *
 **/
fun basicOperation() {
    val fish = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println("Fish Left " + fish)
}
//output : Fish Left 10

/*
* Conditional statement if and else, when
**/
fun conditionalStatement() {
    val fish = 30
    if (fish in 1..50) println("fish " + fish)
    else println("out of range")

    when (fish) {
        0 -> println("0 fish ")
        30 -> println("30 fish")
        else -> println("so many fishes")
    }
}

//output :  fish 30
//           30 fish


/*
* Initialize and iterate Arrays in kotlin
* */
fun helloArrays() {
    var list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    print(list3)
}

// output : [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]