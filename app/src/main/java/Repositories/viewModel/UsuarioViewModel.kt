package Repositories.viewModel

import Repositories.UsuarioRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import model.Usuario

class UsuarioViewModel(private val repository:
                       UsuarioRepository
) : ViewModel() {
    private val _usuarios =
        MutableStateFlow<List<Usuario>>(emptyList())
    val usuarios = _usuarios
    fun cargarUsuarios() {
        viewModelScope.launch {
            _usuarios.value = repository.getAllUsuarios()
        }
    }
}