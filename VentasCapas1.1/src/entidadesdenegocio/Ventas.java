/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesdenegocio;
import java.util.Date;
/**
 *
 * @author jhonllanes
 */
public class Ventas {
    
    private int ven_id;
    private Date ven_fecha;
    private int productos_pro_id;
    private int cliente_cli_id;

    public int getVen_id() {
        return ven_id;
    }

    public void setVen_id(int ven_id) {
        this.ven_id = ven_id;
    }

    public Date getVen_fecha() {
        return ven_fecha;
    }

    public void setVen_fecha(Date ven_fecha) {
        this.ven_fecha = ven_fecha;
    }

    public int getProductos_pro_id() {
        return productos_pro_id;
    }

    public void setProductos_pro_id(int productos_pro_id) {
        this.productos_pro_id = productos_pro_id;
    }

    public int getCliente_cli_id() {
        return cliente_cli_id;
    }

    public void setCliente_cli_id(int cliente_cli_id) {
        this.cliente_cli_id = cliente_cli_id;
    }

    public void setVen_fecha(String fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
