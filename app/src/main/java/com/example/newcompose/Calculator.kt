package com.example.newcompose

interface Shape{
    fun area():Double
}

class Triangular(val f:Double,val b:Double):Shape{
    override fun area(): Double {
        return .5*f*b
    }

}
class Circle(val f:Double):Shape{
    override fun area(): Double {
        return 3.14*f*f
    }

}
class Square(val f:Double):Shape{
    override fun area(): Double {
        return f*f
    }

}
//class Calculator(val f:Int) {
//    fun Sub(x:Int,y:Int):Int{
//        return x-y
//    }
//    fun Sub(x:Int,y:Int,z:Int):Int{
//        return x-y-z
//    }
//    fun Sub(x:Double,y:Double):Double{
//        return x-y
//    }
//    fun minus(b:Int):Int{
//        return f-b
//    }
//}

fun main(){
//    val subtract=Calculator(5)
//    println( subtract.Sub(5,2))
//    println( subtract.Sub(5,2,1))
//    println( subtract.Sub(5.3,2.3))
//    println(subtract.minus(1))
//    val tri=Triangular(6.0,5.0)
//    val squ=Square(6.0)
//    val cir=Circle(5.0)
//    val shapList= listOf<Shape>(tri,squ,cir)
//    for (elment in shapList){
//        println( elment.area())
//    }
    handle(notification = Notification.Email("youssefshaker@gmail.com","Welcome"))
//    println(tri.area())


}
fun handle(notification: Notification){
    when(notification){
        is Notification.Email-> println("${notification.emailadd}")
        is Notification.Push -> println("${notification.devicetoken}")
        is Notification.SMS -> println("${notification.phonenum}")
    }
}