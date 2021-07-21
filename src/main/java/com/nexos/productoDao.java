package com.nexos;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface productoDao extends CrudRepository<producto, Integer>{
    
    /**
     *
     * @param idusuario
     * @return
     */
    @Query(value="select * from producto where idusuariocrea=?1",nativeQuery = true)
    public List<producto>ListarProductoPorUsuario(Integer idusuario);
    
    
     @Query(value="select * from eliminarproducto(?1)",nativeQuery = true)
     public Integer EliminarProducto(Integer id);
    
    
}
