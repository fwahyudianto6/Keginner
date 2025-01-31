package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val iRegex = Regex("\\d+")
    val bIsMatch = iRegex.find(str)

    return if (bIsMatch != null) {
        val iNumber = bIsMatch.value.toInt() * int
        str.replace(bIsMatch.value, iNumber.toString())
    } else {
        str + int
    }
}
