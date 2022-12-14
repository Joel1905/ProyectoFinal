/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Samuel
 */
public class Lectores {
    private int id_lector;
    private String nombre;
    private String direccion;
    private String telefono;
    private String Ciudad;
    private String Correo;


    public Lectores() {
    }

    
    public Lectores(int id_lector, String nombre, String direccion, String telefono, String Ciudad, String Correo) {
        this.id_lector = id_lector;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Ciudad = Ciudad;
        this.Correo = Correo;
    }



       public int getId_lector() {
        return id_lector;
    }

    public void setId_lector(int id_lector) {
        this.id_lector = id_lector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

  

    
}
