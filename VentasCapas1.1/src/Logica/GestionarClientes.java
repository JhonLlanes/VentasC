/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jhonllanes
 */
public class GestionarClientes {

    Connection c = Conexion.Conexion();

    public void mostrarUsuarios() {
        try {
            String sql = "SELECT \n"
                    + "  cliente.cli_id as id, \n"
                    + "  cliente.cli_cedula as cedula, \n"
                    + "  cliente.cli_nombre as nombre, \n"
                    + "  cliente.cli_apellido as apellido, \n"
                    + "  cliente.cli_edad as edad\n"
                    + "FROM \n"
                    + "  public.cliente;";
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery(sql);
            while (rs1.next()) {
               String id = rs1.getString("id");
               String cedula = rs1.getString("cedula");
               String nombre = rs1.getString("nombre");
               String apellido = rs1.getString("id");
               String edad = rs1.getString("edad");
               System.out.println(id + "  " + cedula+ "  " + nombre+ "  " + apellido+ "  " + edad);
            }
            stmt.close();
            c.close();
        } catch (SQLException ex) {
            ex.getErrorCode();
            System.err.println("error en la consulta");
        }
    }
    
    

}
