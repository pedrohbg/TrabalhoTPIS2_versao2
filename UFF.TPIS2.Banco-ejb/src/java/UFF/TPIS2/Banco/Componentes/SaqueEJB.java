/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Componentes;

import UFF.TPIS2.Banco.Entidades.Cliente;
import UFF.TPIS2.Banco.Entidades.Conta;
import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pedro
 */
@Stateless
public class SaqueEJB {

    @PersistenceContext
    private EntityManager em;
    
    public void Saque(long valor, int idConta)
    {
        Cliente cliente = new Cliente();
        cliente.setNome("pedro");
        cliente.setDataCriacao(new Date());
        cliente.setDataNascimento(new Date());
        cliente.setSenha("senha");
        cliente.setCpf("1236543338i");
        
        em.persist(cliente);
        
        //Conta conta = new Conta();
        //conta.setId(1);
        
        //Conta conta = em.find(Conta.class, idConta);
        
        //conta.setSaldo(conta.getSaldo() - valor);
        
        //em.merge(conta);
        
        
    }
}
