/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ON;

import ODA.GestionarProductos;
import entidadesdenegocio.Productos;
import javax.swing.JOptionPane;

/**
 *
 * @author KLEBER PUCHA
 */
public class GestionarProductoON {
    public boolean GuardarProducto(int cantidad, int id, String nombre, double precio) {
		GestionarProductos gestionarproducto=new GestionarProductos();
		if (validardatos(cantidad,id,nombre,precio)) {
			Productos producto=new Productos();
			producto.setPro_cantidad(cantidad);
                        producto.setPro_id(id);
                        producto.setPro_nombre(nombre);
                        producto.setPro_precio(precio);
			if (gestionarproducto.Insertar(producto))	return true;
			else return false;		
		}else return false;
	}
            private boolean validardatos (int cantidad, int id, String nombre, double precio) {
		if (nombre==null || nombre.equals("")) return false;
                if (isNumeric(nombre)) return false;
                if (isString(precio)) return false;
                if (validarcodigo(id)) return false;
                try {
		if (id<0) return false;
		if (cantidad<0) return false;
		}catch(java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Algunos datos son incorrectos", "No se puede Guardar", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
             public static boolean isNumeric( String s ){
                try{
                double y = Double.parseDouble( s );
                    return true;
                    }
                    catch( NumberFormatException err ){
                    return false;
            }
            }
                   public static boolean isString( Double s ){
                try{
                String y = String.valueOf( s );
                    return true;
                    }
                    catch( NumberFormatException err ){
                    return false;
            }
            }
               	public boolean validarcodigo(int id) {
		try {
			 String y = String.valueOf( id );
                        return true;		
			}catch(java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El codigo debe ser numerico", "No se puede Buscar", JOptionPane.WARNING_MESSAGE);
				return false;
			}
	}
           public Productos BuscarProducto(int id) {
		Productos producto=new Productos();
		GestionarProductos gestionarproducto=new GestionarProductos();
		if (validarcodigo(id)) {
			producto=gestionarproducto.Select(id);
			return producto;
		}else
			return producto;
		
	}
           public boolean ActualizarCantidad(int id) {
		GestionarProductos gestionarproducto=new GestionarProductos();
		if (validarcodigo(id)) {
			if (gestionarproducto.UpdateCantidad(id))return true;
			else return false;		
		}else return false;
	}
	
	
	
	public boolean EliminarLibro(int id) {
		GestionarProductos gestionarproducto=new GestionarProductos();
		if (validarcodigo(id)) {
			if(gestionarproducto.delete(id))
			return true;
			else return false;
		}else
			return false;
		
	}
	
	public boolean ActualizarProducto(int cantidad, int id, String nombre, double precio) {
		GestionarProductos gestionarproducto=new GestionarProductos();
		if (validarcodigo(id)) {
		if (validardatos(cantidad,id,nombre,precio)) {
		Productos producto=new Productos();
			producto.setPro_cantidad(cantidad);
                        producto.setPro_id(id);
                        producto.setPro_nombre(nombre);
                        producto.setPro_precio(precio);
			if (gestionarproducto.UpdateProducto(id))	return true;
			else return false;		
		}else return false;
		}else return false;
	}
}
