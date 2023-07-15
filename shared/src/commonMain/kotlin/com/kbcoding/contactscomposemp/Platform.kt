package com.kbcoding.contactscomposemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform