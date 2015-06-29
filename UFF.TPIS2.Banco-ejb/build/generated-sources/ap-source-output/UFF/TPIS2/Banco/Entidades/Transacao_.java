package UFF.TPIS2.Banco.Entidades;

import UFF.TPIS2.Banco.Entidades.Conta;
import UFF.TPIS2.Banco.Entidades.Investimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-28T22:08:13")
@StaticMetamodel(Transacao.class)
public class Transacao_ { 

    public static volatile SingularAttribute<Transacao, String> codInvest;
    public static volatile SingularAttribute<Transacao, Date> data;
    public static volatile ListAttribute<Transacao, Investimento> investimentoList;
    public static volatile SingularAttribute<Transacao, Conta> idContaOrigem;
    public static volatile SingularAttribute<Transacao, Long> valor;
    public static volatile SingularAttribute<Transacao, Conta> idContaDestino;
    public static volatile SingularAttribute<Transacao, String> tipoMovimentacao;
    public static volatile SingularAttribute<Transacao, Integer> id;
    public static volatile SingularAttribute<Transacao, String> tipoDestino;
    public static volatile SingularAttribute<Transacao, String> vencimento;
    public static volatile SingularAttribute<Transacao, String> codBoleto;

}