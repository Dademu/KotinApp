package com.example.kotinapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform