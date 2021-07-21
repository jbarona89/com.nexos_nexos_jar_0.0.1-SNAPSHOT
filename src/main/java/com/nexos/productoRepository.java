package com.nexos;




import java.util.List;

public interface productoRepository {
    
     public List<producto> ListarProductos();
    
    public Integer EliminarProducto(Integer id);
    
    public void GuardarProducto(producto p);
    
    public void buscarById(producto p);
    
    public List<producto>ListarProductoPorUsuario(Integer id);
    
    
    
}
