package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val iDigits = number.toString().map { it.digitToInt() }
    val iMin = iDigits.minOrNull() ?: 0
    val iMax = iDigits.maxOrNull() ?: 0

    return iMin + iMax
}
