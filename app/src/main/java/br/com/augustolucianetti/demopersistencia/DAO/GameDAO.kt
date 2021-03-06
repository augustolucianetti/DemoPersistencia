package br.com.augustolucianetti.demopersistencia.DAO

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import br.com.augustolucianetti.demopersistencia.model.Game

@Dao
interface  GameDAO {

    @Insert
    fun inserir(game:Game)

    @Delete
    fun apagar(game: Game)

    @Update
    fun atualizar(game: Game)

    @Query("SELECT * From Game")
    fun lerGames() : LiveData<List<Game>>

    @Query("SELECT * FROM Game Where id = :id")
    fun buscarPorId(id: Int): Game
}