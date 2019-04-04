/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf2.sesion;

import com.jsf2.entities.Asignacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gladis
 */
@Stateless
public class AsignacionFacade extends AbstractFacade<Asignacion> {

    @PersistenceContext(unitName = "com_jsf2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignacionFacade() {
        super(Asignacion.class);
    }
    
}
