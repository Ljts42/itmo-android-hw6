package com.github.ljts42.hw6_libs.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.github.ljts42.hw6_libs.utils.Constants

@Dao
interface ChatDao {
    @Query("SELECT * FROM ${Constants.DB_NAME} WHERE channel = :channel ORDER BY id")
    suspend fun getMessages(channel: String): List<MessageModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMessage(message: MessageModel)
}