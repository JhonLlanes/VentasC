/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onegocio;

import entidadesdenegocio.Clientes;
import ODA.GestionarClientes;
import javax.swing.JOptionPane;

/**
 *
 * @author KLEBER PUCHA
 */
public class GestionarClienteON {
    	public boolean GuardarCliente(String nombre, String apellido, String cedula, int edad, int id) {
		GestionarClientes gestionarcliente=new GestionarClientes();
		if (validardatos(nombre, apellido, cedula, edad, id)) {
			Clientes cliente=new Clientes();
			cliente.setCli_nombre(nombre);
                        cliente.setCli_apellido(apellido);
                        cliente.setCli_cedula(cedula);
                        cliente.setCli_edad(edad);
                        cliente.setCli_id(id);
                        if (gestionarcliente.insertarClientes(cliente))	return true;
			else return false;		
		}else return false;
	}
        private boolean validardatos (String nombre, String apellido, String cedula, int edad, int id) {
		if (nombre==null || nombre.equals("")) return false;
		if (apellido==null || apellido.equals("")) return false;
		if (cedula==null || cedula.equals("")) return false;
		try {
		if (edad<1 || edad>100) return false;
		if (id<1) return false;
                if (validarcedula(cedula)==false){ 
                    JOptionPane.showMessageDialog(null, "Cedula Incorrecta", "No se puede Guardar", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
		}catch(java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Algunos datos son incorrectos", "No se puede Guardar", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
        	public Clientes BuscarCliente(String cedula) {
		Clientes cliente=new Clientes();
		GestionarClientes gestionarcliente=new GestionarClientes();
		if (validarcedula(cedula)) {
                        cliente=gestionarcliente.mostrarUsuarios(cedula);
			return cliente;
		}else
			return cliente;
		
	}

        private boolean validarcedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                // Coeficientes de validación cédula
                // El decimo digito se lo considera dígito verificador
                int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                int verificador = Integer.parseInt(cedula.substring(9,10));
                int suma = 0;
                int digito = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                suma += ((digito % 10) + (digito / 10));
                }
                if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                cedulaCorrecta = true;
                }
                else if ((10 - (suma % 10)) == verificador) {
                cedulaCorrecta = true;
                } else {
                cedulaCorrecta = false;
                }
                } else {
                cedulaCorrecta = false;
                }
                } else {
                cedulaCorrecta = false;
                }
    } catch (NumberFormatException nfe) {
        cedulaCorrecta = false;
    } catch (Exception err) {
        System.out.println("Una excepcion ocurrio en el proceso de validadcion");
        cedulaCorrecta = false;
    }
    if (!cedulaCorrecta) {
        System.out.println("La Cédula ingresada es Incorrecta");
    }
        return cedulaCorrecta;
   }
   
  public boolean EliminarCliente(String cedula) {
		GestionarClientes gestionarcliente=new GestionarClientes();
		if (validarcedula(cedula)) {
			if(gestionarcliente.eliminarClientes(cedula))
			return true;
			else return false;
		}else
			return false;
		
	}
	
	public boolean ActualizarCliente(String nombre, String apellido, String cedula, int edad, int id) {
		GestionarClientes gestionarcliente=new GestionarClientes();
		if (validarcedula(cedula)) {
		if (validardatos(nombre, apellido, cedula, edad, id)) {
			Clientes cliente=new Clientes();
			cliente.setCli_nombre(nombre);
                        cliente.setCli_apellido(apellido);
                        cliente.setCli_cedula(cedula);
                        cliente.setCli_edad(edad);
                        cliente.setCli_id(id);
                        if (gestionarcliente.updateClientes(cliente))	return true;
			else return false;		
		}else return false;
		}else return false;
	}      
}
