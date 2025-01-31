package com.dicoding.exam.exam5

import kotlinx.coroutines.delay

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    return (valueA + valueB).also { delay(3000) }
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    return (valueA * valueB).also { delay(2000) }
}
