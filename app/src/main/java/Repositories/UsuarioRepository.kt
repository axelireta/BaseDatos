package Repositories

import dao.UsuarioDao
import model.Usuario

class UsuarioRepository(private val usuarioDao: UsuarioDao) {
    suspend fun addUsuario(usuario: Usuario) = usuarioDao.insertarUsuario(usuario)
    suspend fun getAllUsuarios() = usuarioDao.obtenerUsuarios()
    //suspend fun findUsuario(nombre: String) = usuarioDao.buscarPorNombre(nombre)
}