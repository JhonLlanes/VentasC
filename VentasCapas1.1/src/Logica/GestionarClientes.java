/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author jhonllanes
 */
public class GestionarClientes {
    
    
      public String idusu(String usu, String contra) {
        String ad = usu;
        String co = contra;
//         System.err.println(usu);

        String idusuario = "";
        try {
            String sql = "SELECT \n"
                    + "  usuario.usu_cod as usu_codi, \n"
                    + "  usuario.usu_nom as usu_nomb, \n"
                    + "  usuario.usu_contraseña as usu_con\n"
                    + "FROM \n"
                    + "  public.usuario\n"
                    + "where\n"
                    + "usuario.usu_nom = '" + ad + "'and\n"
                    + "usuario.usu_contraseña='" + contra + "';";
            Connection c = Conexion.Conexion();
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery(sql);
            while (rs1.next()) {
                idusuario = rs1.getString("usu_codi");
            }
            stmt.close();
            c.close();
        } catch (SQLException ex) {
            ex.getErrorCode();
            System.err.println("error en la consulta");
        }
        return idusuario;
    }
    
}
