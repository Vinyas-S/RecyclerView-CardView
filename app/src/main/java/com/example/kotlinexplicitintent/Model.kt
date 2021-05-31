package com.example.kotlinexplicitintent

data class Hobby(var title: String)

object Supplier{

    val hobbies= listOf(
        Hobby("Swimming"),
        Hobby("reading"),
        Hobby("walking"),
        Hobby("Gaming"),
        Hobby("sleeping"),
        Hobby("Eating")
    )
}