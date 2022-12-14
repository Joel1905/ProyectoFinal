
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Samuel
 */
public class LectoresDAO {
 
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean agregarLectores(Lectores ln){
        String sql ="Insert into Lectores (Id_Lector,Nombre,Direccion,Telefono,Ciudad,Correo) value (?,?,?,?,?)";
        try{
        con = cn.getConnection();
        ps= con.prepareStatement(sql);
        ps.setInt(1, ln.getId_lector());
        ps.setString(2, ln.getNombre());
        ps.setString(3, ln.getDireccion());
        ps.setString(4, ln.getTelefono());
        ps.setString(5, ln.getCiudad());
        ps.setString(6, ln.getCorreo());
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
