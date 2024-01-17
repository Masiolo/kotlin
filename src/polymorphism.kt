open class Shape{
    open fun Draw(){
        print("Drawing a Shape")
    }
}

class Rectangle:Shape(){
    override fun Draw() {
        println("Drawing a Rectangle")
    }
}

class Square:Shape(){
    override fun Draw(){
        println("Drawing a Square")
    }
}

fun main() {
    var s = Shape()
    s.Draw()

    var r = Rectangle()
    r.Draw()

    var q = Square()
    q.Draw()
}