package br.com.joseasousa.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform