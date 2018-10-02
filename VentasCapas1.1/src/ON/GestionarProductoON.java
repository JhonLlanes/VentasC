/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ON;

import entidadesdenegocio.Productos;

/**
 *
 * @author KLEBER PUCHA
 */
public class GestionarProductoON {
    public boolean GuardarProducto(String titulo, String autor, String anio, String edicion, String Stock, String Costo) {
		GestionarProductos gestionarlibro=new GestionarProductos();
		if (validardatos(titulo, autor, anio, edicion, Stock, Costo)) {
			Productos producto=new Productos();
			libro.setTitulo(titulo);
			libro.setAutor(autor);
			libro.setAnio(anio);
			libro.setEdicion(edicion);
			libro.setStock(Integer.parseInt(Stock));
			libro.setCosto(Double.parseDouble(Costo));
			if (gestionarlibro.Insertar(libro))	return true;
			else return false;		
		}else return false;
	}
}
