/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author jhonllanes
 */
public class Clientes {
    
    Connection c = Conexion.Conexion();
    
    private int cli_id;
    private String cli_cedula;
    private String cli_nombre;
    private String cli_apellido;
    private int cli_edad;

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_cedula() {
        return cli_cedula;
    }

    public void setCli_cedula(String cli_cedula) {
        this.cli_cedula = cli_cedula;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public int getCli_edad() {
        return cli_edad;
    }

    public void setCli_edad(int cli_edad) {
        this.cli_edad = cli_edad;
    }
    
    public void insertar(){
          try {
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            String sql = "INSERT INTO public.cliente"
                    + "(cli_cedula, cli_nombre, cli_apellido, cli_edad)"
                    + "VALUES ('"+getCli_cedula()+"','"+getCli_nombre()+ "','"+getCli_apellido()+"', "+getCli_edad()+");";//insertar datos codigo 
              System.out.println(sql);
            stmt.executeUpdate(sql);
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
