/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Componentes;

import UFF.TPIS2.Banco.Entidades.Conta;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pedro
 */
@Stateless
@LocalBean
public class SaqueEJB {

    @PersistenceContext
    EntityManager em;
    
    public void Saque(long valor, int idConta){
        
        Conta conta = em.find(Conta.class, idConta);
        
        conta.setSaldo(conta.getSaldo() - valor);
        
        em.merge(conta);
        
    }
}
