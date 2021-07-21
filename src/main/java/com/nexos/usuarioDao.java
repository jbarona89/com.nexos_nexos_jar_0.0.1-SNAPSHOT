package com.nexos;

import com.nexos.Modelo.usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface usuarioDao extends CrudRepository<usuario, Integer> {

   @Query(value=" select * from eliminarUsuarios(?1)",nativeQuery = true)
    public Integer EliminarUsuario(Integer id);
    
  
}
