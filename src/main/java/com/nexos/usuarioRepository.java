package com.nexos;


import com.nexos.Modelo.usuario;
import java.util.List;

public interface usuarioRepository {

    public List<usuario> ListarUsuarios();

    public Integer EliminarUsuario(Integer id);

    public void GuardarUsuario(usuario u);

    public void buscarById(usuario u);
    
    public void EditarUsuario(usuario u);

}
