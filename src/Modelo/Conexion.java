
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Samuel
 */
public class Conexion {
    Connection con;
    
    public Connection getConnection(){
       try {
            String myBD = "jdbc:mysql://localhost:3306/proyecto_final";
            con = DriverManager.getConnection(myBD, "root", "samuel");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
