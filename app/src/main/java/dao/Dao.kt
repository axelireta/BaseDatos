package dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun insertarUsuario(usuario: Usuario)

    @Query("SELECT * FROM usuarios_table")
    suspend fun obtenerUsuarios(): List<Usuario>
}