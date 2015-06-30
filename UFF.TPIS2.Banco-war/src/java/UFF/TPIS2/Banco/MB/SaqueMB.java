/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.MB;

import UFF.TPIS2.Banco.Componentes.SaqueEJB;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;


/**
 *
 * @author Pedro
 */


@ManagedBean(name="saqueMB")
public class SaqueMB {
  @EJB
  private SaqueEJB saqueEJB;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Long valor;
    private int idConta;

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    public void Saque(SaqueMB saqueMB){
 //       saqueEJB = new SaqueEJB();
        saqueEJB.Saque(saqueMB.valor, saqueMB.idConta);
    }
    
  
    
}
