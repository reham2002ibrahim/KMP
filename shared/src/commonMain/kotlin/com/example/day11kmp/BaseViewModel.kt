package com.example.day11kmp

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel() {
    val scope : CoroutineScope
}