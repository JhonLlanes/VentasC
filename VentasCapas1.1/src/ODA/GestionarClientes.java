/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ODA;

import entidadesdenegocio.Clientes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonllanes
 */
public class GestionarClientes {
   //FALTA CONEXION A LA BASEJJ
    Connection c = Conexion.Conexion();
    entidadesdenegocio.Clientes cl = new entidadesdenegocio.Clientes();

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
            ex.printStackTrace();
            System.err.println("error en la consulta");
        }
    }
    
    public void eliminarClientes(){
        try {
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            String sql = ""; //aqui va el sql 
            stmt.executeUpdate(sql);
             c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateClientes(){
        try {          
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            String sql = "" ; //va el codigo de 
            stmt.executeUpdate(sql);
             c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    public void insertarClientes(){
   
          try {
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
//            String sql = "INSERT INTO public.cliente"
//                    + "(cli_cedula, cli_nombre, cli_apellido, cli_edad)"
//                    + "VALUES ('"+getCli_cedula()+"','"+getCli_nombre()+ "','"+getCli_apellido()+"', "+getCli_edad()+");";//insertar datos codigo 
//              System.out.println(sql);
//            stmt.executeUpdate(sql);
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insertarClientes(Clientes cliente) {
            if (!cedula(cliente.getCli_cedula()))
				return false;
        return false;
    }

    public Clientes mostrarUsuarios(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean eliminarClientes(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateClientes(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean cedula(String cedula) {
	        try {
                    //AQUI TAMBIENNFALTA LA CONEXION DE LA BASE
	             conexion conexion = new conexion();
	    	     conexion.conectar();
	    	      Connection conn = conexion.conn;	  
	            // Llamada al procedimiento almacenado
	            CallableStatement cst = (CallableStatement) conn.prepareCall("{call validarcedula (?,?)}");
	                // Parametro 1 del procedimiento almacenado
	                cst.setString(1, cedula);
	                cst.registerOutParameter(2, java.sql.Types.INTEGER);
	                // Ejecuta el procedimiento almacenado
	                cst.execute();
	                
	                // Se obtienen la salida del procedimineto almacenado
	              int valor = cst.getInt(2);
	              conn.close();
	      	      conexion.desconectar();
	      	      
	      	      if (valor==1)
	      	      return true;
	      	      else 
	      	    	return false;
	                
	        } catch (Exception e)
		    {
	  	      System.err.println("Got an exception!");
	  	      System.err.println(e.getMessage());
	  	      JOptionPane.showMessageDialog(null, e.getMessage(), "No se puede Guardar", JOptionPane.WARNING_MESSAGE);
	  	      return false;
	  	    }	
	}
}
