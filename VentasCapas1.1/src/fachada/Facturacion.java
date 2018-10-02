/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import ON.GestionarProductoON;
import ON.GestionarVentaON;

/**
 *
 * @author KLEBER PUCHA
 */
public class Facturacion {
    //recibimos los datos que envia desde boton vender de la interfaz
    	public boolean facturar (int id_cli, int id_producto, String fecha, int id) {
	//invocamos al objeto de negocio GestionarVentaON
        GestionarVentaON gvon=new GestionarVentaON();
        //invocamos al objeto de negocio GestionarProductoON
	GestionarProductoON glon=new GestionarProductoON();
        //verificamos si se puede guardar los datos con el paso de validaciones
	if(gvon.GuardarVenta(id_cli, id_producto, fecha, id)) {
               //verificamos si se puede actualizar la cantidad de producto
		if(glon.ActualizarCantidad(id)) {
			return true;
		}else return false;
	}else return false;
	}
}
