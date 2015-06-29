package UFF.TPIS2.Banco.Entidades;

import UFF.TPIS2.Banco.Entidades.Cliente;
import UFF.TPIS2.Banco.Entidades.Investimento;
import UFF.TPIS2.Banco.Entidades.Transacao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-28T22:08:13")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, String> tipo;
    public static volatile SingularAttribute<Conta, Cliente> idCliente;
    public static volatile ListAttribute<Conta, Investimento> investimentoList;
    public static volatile ListAttribute<Conta, Transacao> transacaoList;
    public static volatile ListAttribute<Conta, Transacao> transacaoList1;
    public static volatile SingularAttribute<Conta, Integer> id;
    public static volatile SingularAttribute<Conta, Long> saldo;
    public static volatile SingularAttribute<Conta, Date> dataCriacao;

}