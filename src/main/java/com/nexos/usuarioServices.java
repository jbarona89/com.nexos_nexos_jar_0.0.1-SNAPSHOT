
package com.nexos;

import com.nexos.Modelo.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class usuarioServices  implements usuarioRepository{
    
    @Autowired
    private usuarioDao dao;

    @Override
    public List<usuario> ListarUsuarios() {
        return (List<usuario>) dao.findAll();
    }

    @Override
    public Integer EliminarUsuario(Integer id) {
        return dao.EliminarUsuario(id);
    }

    @Override
    public void GuardarUsuario(usuario u) {
        dao.save(u);
    }

    @Override
    public void buscarById(usuario u) {
        
    }

    @Override
    public void EditarUsuario(usuario u) {
        dao.save(u);
    }

    
}
