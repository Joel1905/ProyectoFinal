/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Samuel
 */
public class Prestamos {
    
    private int Idsalida;
    private String Nomlibro;
    private String Autor;
    private String FechaSalida;
    private String FechaDevolucion;
    private String Oservacion;

    public Prestamos() {
    }

    public Prestamos(int Idsalida, String Nomlibro, String Autor, String FechaSalida, String FechaDevolucion, String Oservacion) {
        this.Idsalida = Idsalida;
        this.Nomlibro = Nomlibro;
        this.Autor = Autor;
        this.FechaSalida = FechaSalida;
        this.FechaDevolucion = FechaDevolucion;
        this.Oservacion = Oservacion;
    }

    public int getIdsalida() {
        return Idsalida;
    }

    public void setIdsalida(int Idsalida) {
        this.Idsalida = Idsalida;
    }

    public String getNomlibro() {
        return Nomlibro;
    }

    public void setNomlibro(String Nomlibro) {
        this.Nomlibro = Nomlibro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public String getOservacion() {
        return Oservacion;
    }

    public void setOservacion(String Oservacion) {
        this.Oservacion = Oservacion;
    }


    
}
