package br.com.augustolucianetti.demopersistencia.DAO

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import android.support.v4.content.ContextCompat
import br.com.augustolucianetti.demopersistencia.model.Game
import java.security.AccessControlContext

@Database(entities = arrayOf(Game::class), version = 1)
abstract class BancoDeDados : RoomDatabase() {

    abstract fun gameDAO(): GameDAO

    companion object {

        var INSTANCE :BancoDeDados? = null

        fun getDatabase(context: Context): BancoDeDados? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, BancoDeDados::class.java, "games").build()
            }
            return INSTANCE
        }
    }
}