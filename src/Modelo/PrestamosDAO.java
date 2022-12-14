/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class PrestamosDAO {
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean agregarPrestamos(Prestamos pr){
        String sql ="Insert into Lectores (Id_Salida,Nom_libro,Autor,Fecha_Salida,Fecha_Devolucion,Oservacion) value (?,?,?,?,?)";
        try{
        con = cn.getConnection();
        ps= con.prepareStatement(sql);
        ps.setInt(1, pr.getIdsalida());
        ps.setString(2, pr.getNomlibro());
        ps.setString(3, pr.getAutor());
        ps.setString(4, pr.getFechaSalida());
        ps.setString(5, pr.getFechaDevolucion());
        ps.setString(6, pr.getOservacion());
        ps.execute();
        return true;
        }catch(SQLException e){
        JOptionPane.showConfirmDialog(null, e.toString());
        return false;
        } finally{
            try{con.close();
            }catch (SQLException e){
                System.out.println(e.toString());
            }
        }
    }

}
