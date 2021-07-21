
package com.nexos;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class productoServices implements productoRepository{
    
    @Autowired
    private productoDao productoDao;

    @Override
    public List<producto> ListarProductos() {
        return (List<producto>) productoDao.findAll();
    }

    @Override
    public Integer EliminarProducto(Integer id) {
        return productoDao.EliminarProducto(id);
    }

    @Override
    public void GuardarProducto(producto p) {
        productoDao.save(p);
    }

    @Override
    public void buscarById(producto p) {
    }

    

    @Override
    public List<producto> ListarProductoPorUsuario(Integer id) {
         return (List<producto>) productoDao.ListarProductoPorUsuario(id);
    }

}

