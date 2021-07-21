package com.nexos.Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "usuario")
public class usuario  implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idusuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private Integer edad;
    @Column(name="cargo")
    private String cargo;
    @Column(name="fechaingreso")
    private Date fechaingreso;

    public usuario() {
    }

    public usuario(String nombre, Integer edad, String cargo, Date fechaingreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaingreso = fechaingreso;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    
}
