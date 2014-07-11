/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.base.bean;

import br.org.base.model.Model01;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;

/**
 *
 * @author guilherme
 */
@Named
@Stateless
public class Bean01 implements Bean01Local {

    /*  ================
     *  Attributes
     *  ================
     */
    @PersistenceContext(unitName = "br.org.base_ProjetoZero-ejb_ejb_1.0-SNAPSHOTPU", synchronization = SynchronizationType.UNSYNCHRONIZED)
    private EntityManager em;

    @Override
    public String businessMethod(String parameter) {

        Model01 model01 = new Model01();
        model01.setNome("lkhjljlj");
        em.persist(em);

        return "Metodo";
    }

    public List<Model01> lista() {

        TypedQuery<Model01> query = em.createNamedQuery("findAllModel01", Model01.class).setParameter("param", "a");
        return query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
