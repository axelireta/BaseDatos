package Database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import converter.Converters
import dao.UsuarioDao
import model.Usuario

@Database(entities = [Usuario::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
}