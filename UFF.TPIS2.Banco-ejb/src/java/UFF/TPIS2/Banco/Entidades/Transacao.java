/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pedro
 */
@Entity
@Table(name = "transacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transacao.findAll", query = "SELECT t FROM Transacao t"),
    @NamedQuery(name = "Transacao.findById", query = "SELECT t FROM Transacao t WHERE t.id = :id"),
    @NamedQuery(name = "Transacao.findByData", query = "SELECT t FROM Transacao t WHERE t.data = :data"),
    @NamedQuery(name = "Transacao.findByTipoMovimentacao", query = "SELECT t FROM Transacao t WHERE t.tipoMovimentacao = :tipoMovimentacao"),
    @NamedQuery(name = "Transacao.findByTipoDestino", query = "SELECT t FROM Transacao t WHERE t.tipoDestino = :tipoDestino"),
    @NamedQuery(name = "Transacao.findByValor", query = "SELECT t FROM Transacao t WHERE t.valor = :valor"),
    @NamedQuery(name = "Transacao.findByVencimento", query = "SELECT t FROM Transacao t WHERE t.vencimento = :vencimento"),
    @NamedQuery(name = "Transacao.findByCodBoleto", query = "SELECT t FROM Transacao t WHERE t.codBoleto = :codBoleto"),
    @NamedQuery(name = "Transacao.findByCodInvest", query = "SELECT t FROM Transacao t WHERE t.codInvest = :codInvest")})
public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "tipo_movimentacao")
    private String tipoMovimentacao;
    @Size(max = 4)
    @Column(name = "tipo_destino")
    private String tipoDestino;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private long valor;
    @Size(max = 10)
    @Column(name = "Vencimento")
    private String vencimento;
    @Size(max = 100)
    @Column(name = "cod_boleto")
    private String codBoleto;
    @Size(max = 4)
    @Column(name = "cod_invest")
    private String codInvest;
    @JoinColumn(name = "id_conta_destino", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Conta idContaDestino;
    @JoinColumn(name = "id_conta_origem", referencedColumnName = "id")
    @ManyToOne
    private Conta idContaOrigem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transacaoId")
    private List<Investimento> investimentoList;

    public Transacao() {
    }

    public Transacao(Integer id) {
        this.id = id;
    }

    public Transacao(Integer id, Date data, String tipoMovimentacao, long valor) {
        this.id = id;
        this.data = data;
        this.tipoMovimentacao = tipoMovimentacao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getCodBoleto() {
        return codBoleto;
    }

    public void setCodBoleto(String codBoleto) {
        this.codBoleto = codBoleto;
    }

    public String getCodInvest() {
        return codInvest;
    }

    public void setCodInvest(String codInvest) {
        this.codInvest = codInvest;
    }

    public Conta getIdContaDestino() {
        return idContaDestino;
    }

    public void setIdContaDestino(Conta idContaDestino) {
        this.idContaDestino = idContaDestino;
    }

    public Conta getIdContaOrigem() {
        return idContaOrigem;
    }

    public void setIdContaOrigem(Conta idContaOrigem) {
        this.idContaOrigem = idContaOrigem;
    }

    @XmlTransient
    public List<Investimento> getInvestimentoList() {
        return investimentoList;
    }

    public void setInvestimentoList(List<Investimento> investimentoList) {
        this.investimentoList = investimentoList;
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
        if (!(object instanceof Transacao)) {
            return false;
        }
        Transacao other = (Transacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UFF.TPIS2.Banco.Entidades.Transacao[ id=" + id + " ]";
    }
    
}
