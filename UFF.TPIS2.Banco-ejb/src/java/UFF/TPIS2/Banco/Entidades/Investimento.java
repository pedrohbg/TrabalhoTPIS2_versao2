/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pedro
 */
@Entity
@Table(name = "investimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Investimento.findAll", query = "SELECT i FROM Investimento i"),
    @NamedQuery(name = "Investimento.findById", query = "SELECT i FROM Investimento i WHERE i.id = :id"),
    @NamedQuery(name = "Investimento.findByTipoInvestimento", query = "SELECT i FROM Investimento i WHERE i.tipoInvestimento = :tipoInvestimento"),
    @NamedQuery(name = "Investimento.findBySaldo", query = "SELECT i FROM Investimento i WHERE i.saldo = :saldo"),
    @NamedQuery(name = "Investimento.findByRendimento", query = "SELECT i FROM Investimento i WHERE i.rendimento = :rendimento"),
    @NamedQuery(name = "Investimento.findByDataCriacao", query = "SELECT i FROM Investimento i WHERE i.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Investimento.findByIdConta", query = "SELECT i FROM Investimento i WHERE i.idConta = :idConta")})
public class Investimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 4)
    @Column(name = "tipo_investimento")
    private String tipoInvestimento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private long saldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rendimento")
    private long rendimento;
    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_conta")
    private int idConta;
    @JoinColumn(name = "transacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Transacao transacaoId;
    @JoinColumn(name = "conta_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Conta contaId;

    public Investimento() {
    }

    public Investimento(Integer id) {
        this.id = id;
    }

    public Investimento(Integer id, long saldo, long rendimento, int idConta) {
        this.id = id;
        this.saldo = saldo;
        this.rendimento = rendimento;
        this.idConta = idConta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getRendimento() {
        return rendimento;
    }

    public void setRendimento(long rendimento) {
        this.rendimento = rendimento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Transacao getTransacaoId() {
        return transacaoId;
    }

    public void setTransacaoId(Transacao transacaoId) {
        this.transacaoId = transacaoId;
    }

    public Conta getContaId() {
        return contaId;
    }

    public void setContaId(Conta contaId) {
        this.contaId = contaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Investimento)) {
            return false;
        }
        Investimento other = (Investimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UFF.TPIS2.Banco.Entidades.Investimento[ id=" + id + " ]";
    }
    
}
