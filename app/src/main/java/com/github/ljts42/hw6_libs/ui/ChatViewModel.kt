package com.github.ljts42.hw6_libs.ui

import androidx.lifecycle.ViewModel
import com.github.ljts42.hw6_libs.network.Message

class ChatViewModel : ViewModel() {
    var messages: MutableList<Message> = mutableListOf()

    fun lastId(): Int {
        return if (messages.isEmpty()) 5555 else messages.last().id!!
    }
}