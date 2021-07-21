/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nexos;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/producto")
public class productoRest {

    @Autowired
    private productoRepository productoRepo;

    @GetMapping
    public List<producto>listarproductos(){ 
          return productoRepo.ListarProductos();
    }
    
    @PostMapping
    public void GuardarProducto(@RequestBody  producto p){
        productoRepo.GuardarProducto(p);
    }
    
     @PutMapping
    public void EditarProducto(@RequestBody  producto p){
        productoRepo.GuardarProducto(p);
    }
    
    @GetMapping(value = "/eliminarproducto/{id}", produces = "text/plain")
    @RequestMapping(value ="/eliminarproducto/{id}")
    public Integer ElimimarProducto (@PathVariable("id") Integer id){
         return productoRepo.EliminarProducto(id);
    }
    
   
    
    @GetMapping(value = "/{id}", produces = "text/plain")
    @RequestMapping(value ="/{id}")
    public List<producto>listarproductosByid(@PathVariable("id") Integer id){ 
          return productoRepo.ListarProductoPorUsuario(id);
    }
    
}