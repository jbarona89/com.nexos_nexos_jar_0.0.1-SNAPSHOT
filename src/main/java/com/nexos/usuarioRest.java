package com.nexos;





import com.nexos.Modelo.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/usuario")
public class usuarioRest {

   @Autowired
    private usuarioRepository repository;

    @GetMapping
    public List<usuario>nombre(){ 
          return repository.ListarUsuarios();
    }
    
    @PostMapping(value = "/guardardarUsuario/", produces = "text/plain")
    @CrossOrigin
    @ResponseBody
    public void GuardarUsuario(@RequestBody  usuario usu){
        repository.GuardarUsuario(usu);
    }
    
     @PutMapping
    public void EditarUsuario(@RequestBody  usuario usu){
        repository.GuardarUsuario(usu);
    }

    @GetMapping(value = "/EliminarUsuario/{id}", produces = "text/plain")
    @RequestMapping(value ="/{id}")
    public Integer  ElimimarUsuarios (@PathVariable (value="id") Integer id){
       return repository.EliminarUsuario(id);
    }
    
   
}


