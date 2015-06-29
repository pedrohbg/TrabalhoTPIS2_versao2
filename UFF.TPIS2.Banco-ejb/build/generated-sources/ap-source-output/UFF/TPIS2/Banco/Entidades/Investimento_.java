package UFF.TPIS2.Banco.Entidades;

import UFF.TPIS2.Banco.Entidades.Conta;
import UFF.TPIS2.Banco.Entidades.Transacao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-28T22:08:13")
@StaticMetamodel(Investimento.class)
public class Investimento_ { 

    public static volatile SingularAttribute<Investimento, Long> rendimento;
    public static volatile SingularAttribute<Investimento, Integer> idConta;
    public static volatile SingularAttribute<Investimento, Integer> id;
    public static volatile SingularAttribute<Investimento, Long> saldo;
    public static volatile SingularAttribute<Investimento, Transacao> transacaoId;
    public static volatile SingularAttribute<Investimento, String> tipoInvestimento;
    public static volatile SingularAttribute<Investimento, Date> dataCriacao;
    public static volatile SingularAttribute<Investimento, Conta> contaId;

}