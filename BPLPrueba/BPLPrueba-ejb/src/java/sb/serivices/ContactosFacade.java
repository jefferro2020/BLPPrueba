/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb.serivices;

import efd.contactos.Contactos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jeffr
 */
@Stateless
public class ContactosFacade extends AbstractFacade<Contactos> implements ContactosFacadeLocal {

    @PersistenceContext(unitName = "BPLPrueba-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactosFacade() {
        super(Contactos.class);
    }
    
}
