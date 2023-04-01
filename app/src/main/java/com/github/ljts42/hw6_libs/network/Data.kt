package com.github.ljts42.hw6_libs.network

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val Text: TextData? = null, val Image: ImageData? = null
)