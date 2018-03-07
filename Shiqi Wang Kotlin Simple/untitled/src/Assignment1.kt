fun main(args: Array<String>) {
//    val name = "Dale"
//     println(name)

//    vale name2 = "Karen"
//     println(name2)
    var sample1:Byte = 0x3A;
    println(sample1);
    var sample2:Byte = 58;
    println(sample2);
    var heartRate: Int = 85;
    var deposit: Double= 135002796.00;
    var acceleration: Float = 9.800f;
    var mass: Float = 14.6f;
    var distance: Double = 129.763001;
    var lost: Boolean = true;
    var expensive: Boolean = true;
    var choice: Int = 2;
    val integral = "∫";
    var greeting: String = "Hello";
    var name:String = "Karen"

    if (sample1 == sample2) {
        println("The samples are equal")
    } else {
        println("The samples are not equal")
    }


    if ( heartRate in 40..80){
        println("heartRate is normal")
    } else {
        println("hearrate is not normal")
    }
    if ( deposit >= 100000000 ){
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor")
    }

    var force = mass * acceleration
    println("force =" + force)

    println("$distance is distance")

    if (lost && expensive) {
        println("I am really sorry! I will get the manager.")
    } else if (lost && !expensive) {
        println("Here is coupon for 10% off.")
    }
    when(choice){
        1 -> println("You chose 1")
        2 -> println("You chose 2")
        3 -> println("You chose 3")
        else -> {
            println("You made an unknown choice.")
        }
    }
    println("$integral is an integral")

    for ( i in 5..10){
        println(" i = $i")
    }

    var age: Int = 0
    while (age<6){
        println("age = $age")
        age++
    }


    println("$greeting $name")

}