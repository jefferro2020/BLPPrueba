/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb.Bean;

import efd.contactos.Contactos;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import sb.serivices.ContactosFacadeLocal;


/**
 *
 * @author Jeffr
 */
@Named(value = "bean")
@RequestScoped
public class ContactoBean {

    @EJB
    private ContactosFacadeLocal contactosFacade;
    private String nombre;
    private String apellidos;
    private java.util.Date fechaNacimiento;
    private String telefono;
    private String correo;
    private String comentarios;
    
    /**
     * Creates a new instance of ContactoBean
     */
    public ContactoBean() {
    }
    public List<Contactos> getContactos(){
        return contactosFacade.findAll();
    }
    
    public String Crear(){
    Contactos cto = new Contactos();
    cto.setNombre(nombre);
    cto.setApellido(apellidos);
    cto.setFechaNacimiento(fechaNacimiento);
    cto.setTelefono(telefono);
    cto.setCorreoElectronico(correo);
    cto.setComentario(comentarios);
    contactosFacade.create(cto);
    return "index";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNecimiento() {
        return fechaNacimiento;
    }

    public void setFechaNecimiento(Date fechaNecimiento) {
        this.fechaNacimiento = fechaNecimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
}
