package com.github.ljts42.hw6_libs.network

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageData(val link: String)