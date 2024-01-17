class Person{
    //Attribites/Properties/Variables/Characteristics
    var name = ""
    var location = ""
    var school = ""
    var skincolor = ""

    // Behaiour/Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }

}

fun main() {
    var teacher= Person()
    teacher.name= "Masiolo"
    println(teacher.name)

    teacher.eat()
    var accountant =Person()
    accountant.skincolor="Brown"
    println(accountant.skincolor)
    accountant.walk()
}