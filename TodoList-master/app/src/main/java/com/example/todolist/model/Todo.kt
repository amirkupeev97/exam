package com.example.todolist.model

data class Todo(
    val title: String,
    var isChecked: Boolean = false ,
    val ID : String ,
    val descrp : String ,
    val category : String ,
    val duration : String ,
)