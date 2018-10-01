/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onegocio;

import Datos.Ventas;
import Logica.GestionarVentas;
import javax.swing.JOptionPane;

/**
 *
 * @author KLEBER PUCHA
 */
public class GestionarVentaON {
    public boolean GuardarVenta(int idcliente, int idproducto, String fecha, int id) {
		GestionarVentas gestionarventa=new GestionarVentas();
		if (validardatos(idcliente, idproducto, fecha, id)) {
			Ventas venta=new Ventas();
                        venta.setCliente_cli_id(0);
                        venta.setProductos_pro_id(0);
                        venta.setVen_fecha(fecha);
                        venta.setVen_id(0);
			if (gestionarventa.Insertar(venta))	return true;
			else return false;		
		}else return false;
	}
	
	private boolean validardatos (int idcliente, int idproducto, String fecha, int id) {
		if (idcliente<=0) return false;
		if (idproducto<=0) return false;
		if (fecha==null || fecha.equals("")) return false;
		if (id<=0) return false;
                try {
	
		}catch(java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Existen datos incorrectos", "No se puede Guardar", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
}
