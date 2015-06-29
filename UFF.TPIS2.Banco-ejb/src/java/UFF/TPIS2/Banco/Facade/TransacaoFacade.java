/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Facade;

import UFF.TPIS2.Banco.Entidades.Transacao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pedro
 */
@Stateless
public class TransacaoFacade extends AbstractFacade<Transacao> {
    @PersistenceContext(unitName = "UFF.TPIS2.Banco-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransacaoFacade() {
        super(Transacao.class);
    }
    
}