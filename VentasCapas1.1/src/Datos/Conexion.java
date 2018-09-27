
package Datos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection Conexion() {
        Connection conexion=null;
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/ventas";
        String user = "postgres";
        String password = "admin";

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(connectString, user, password);
            Statement stmt = conexion.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la Conexion A la base de datos");
        }
        return conexion;
    }
}
