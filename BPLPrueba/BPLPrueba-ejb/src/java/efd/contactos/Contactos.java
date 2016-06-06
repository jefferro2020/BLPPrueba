/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efd.contactos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeffr
 */
@Entity
@Table(name = "contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c"),
    @NamedQuery(name = "Contactos.findById", query = "SELECT c FROM Contactos c WHERE c.id = :id"),
    @NamedQuery(name = "Contactos.findByNombre", query = "SELECT c FROM Contactos c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Contactos.findByApellido", query = "SELECT c FROM Contactos c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Contactos.findByCorreoElectronico", query = "SELECT c FROM Contactos c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Contactos.findByTelefono", query = "SELECT c FROM Contactos c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Contactos.findByFechaNacimiento", query = "SELECT c FROM Contactos c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Contactos.findByComentario", query = "SELECT c FROM Contactos c WHERE c.comentario = :comentario"),
    @NamedQuery(name = "Contactos.findByFechaRegistro", query = "SELECT c FROM Contactos c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Contactos.findByDireccionIp", query = "SELECT c FROM Contactos c WHERE c.direccionIp = :direccionIp"),
    @NamedQuery(name = "Contactos.findByAgente", query = "SELECT c FROM Contactos c WHERE c.agente = :agente"),
    @NamedQuery(name = "Contactos.findBySystemaOperativo", query = "SELECT c FROM Contactos c WHERE c.systemaOperativo = :systemaOperativo")})
public class Contactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 80)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Size(max = 25)
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 250)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 40)
    @Column(name = "DIRECCION_IP")
    private String direccionIp;
    @Size(max = 40)
    @Column(name = "AGENTE")
    private String agente;
    @Size(max = 50)
    @Column(name = "SYSTEMA_OPERATIVO")
    private String systemaOperativo;

    public Contactos() {
    }

    public Contactos(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getSystemaOperativo() {
        return systemaOperativo;
    }

    public void setSystemaOperativo(String systemaOperativo) {
        this.systemaOperativo = systemaOperativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "efd.contactos.Contactos[ id=" + id + " ]";
    }
    
}
