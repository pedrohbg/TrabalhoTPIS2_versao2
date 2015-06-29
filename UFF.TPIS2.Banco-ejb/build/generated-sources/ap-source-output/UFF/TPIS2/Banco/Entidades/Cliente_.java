package UFF.TPIS2.Banco.Entidades;

import UFF.TPIS2.Banco.Entidades.Conta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-28T22:08:13")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> senha;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile ListAttribute<Cliente, Conta> contaList;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, Date> dataNascimento;
    public static volatile SingularAttribute<Cliente, Date> dataCriacao;

}