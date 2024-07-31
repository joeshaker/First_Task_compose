package com.example.newcompose

sealed class Notification {
    data class Email(val emailadd:String,val message:String):Notification()
    data class SMS(val phonenum:String,val message:String):Notification()
    data class Push(val devicetoken:String,val message:String):Notification()

}