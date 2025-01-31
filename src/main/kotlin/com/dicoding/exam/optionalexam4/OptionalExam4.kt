package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val iLength = string.length

    return if (iLength % 2 == 0) {
        string.substring(iLength / 2 - 1, iLength / 2 + 1)
    } else {
        string.substring(iLength / 2, iLength / 2 + 1)
    }
}
