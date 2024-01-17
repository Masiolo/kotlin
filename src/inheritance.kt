//Parent Class/ Super Class/ Base Class
open class Animal{
    var age = 12
    var gender = "male"

    fun sound(){
        println("Animal is speaking")

    }
}
//Child class/derived
class Dog:Animal(){
    fun bark(){
        println("Dog is barking")
    }
}
class Fish:Animal(){
    fun swim(){
        println("Fish is swimming")
    }
}

fun main() {
    var a =Animal()
    println(a.age)
    a.sound()

    var d =Dog()
    d.sound()
    println(d.gender)

    var f = Fish()
    f.swim()
    println(f.age)
}