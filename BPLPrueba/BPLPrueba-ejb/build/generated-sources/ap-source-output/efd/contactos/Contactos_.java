package efd.contactos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-05T18:29:30")
@StaticMetamodel(Contactos.class)
public class Contactos_ { 

    public static volatile SingularAttribute<Contactos, Short> id;
    public static volatile SingularAttribute<Contactos, String> nombre;
    public static volatile SingularAttribute<Contactos, String> apellido;
    public static volatile SingularAttribute<Contactos, String> correoElectronico;
    public static volatile SingularAttribute<Contactos, String> telefono;
    public static volatile SingularAttribute<Contactos, String> agente;
    public static volatile SingularAttribute<Contactos, String> systemaOperativo;
    public static volatile SingularAttribute<Contactos, Date> fechaRegistro;
    public static volatile SingularAttribute<Contactos, String> direccionIp;
    public static volatile SingularAttribute<Contactos, Date> fechaNacimiento;
    public static volatile SingularAttribute<Contactos, String> comentario;

}