package org.example.basic_kmp_comp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform