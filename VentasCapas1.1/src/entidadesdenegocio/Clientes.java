/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesdenegocio;
/**
 *
 * @author jhonllanes
 */
public class Clientes {
       
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
    
    // aqui crear los metodos para validar todos estos campos 
    
}
