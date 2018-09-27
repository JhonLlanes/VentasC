/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author jhonllanes
 */
public class Productos {
    private int pro_id;
    private String pro_nombre;
    private double pro_precio;
    private int pro_cantidad;

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public double getPro_precio() {
        return pro_precio;
    }

    public void setPro_precio(double pro_precio) {
        this.pro_precio = pro_precio;
    }

    public int getPro_cantidad() {
        return pro_cantidad;
    }

    public void setPro_cantidad(int pro_cantidad) {
        this.pro_cantidad = pro_cantidad;
    }
    
    
}
