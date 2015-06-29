/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFF.TPIS2.Banco.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pedro
 */
@Entity
@Table(name = "tipo_movimentacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMovimentacao.findAll", query = "SELECT t FROM TipoMovimentacao t"),
    @NamedQuery(name = "TipoMovimentacao.findByIdtipoMovimentacao", query = "SELECT t FROM TipoMovimentacao t WHERE t.idtipoMovimentacao = :idtipoMovimentacao")})
public class TipoMovimentacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipo_movimentacao")
    private Integer idtipoMovimentacao;

    public TipoMovimentacao() {
    }

    public TipoMovimentacao(Integer idtipoMovimentacao) {
        this.idtipoMovimentacao = idtipoMovimentacao;
    }

    public Integer getIdtipoMovimentacao() {
        return idtipoMovimentacao;
    }

    public void setIdtipoMovimentacao(Integer idtipoMovimentacao) {
        this.idtipoMovimentacao = idtipoMovimentacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoMovimentacao != null ? idtipoMovimentacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMovimentacao)) {
            return false;
        }
        TipoMovimentacao other = (TipoMovimentacao) object;
        if ((this.idtipoMovimentacao == null && other.idtipoMovimentacao != null) || (this.idtipoMovimentacao != null && !this.idtipoMovimentacao.equals(other.idtipoMovimentacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UFF.TPIS2.Banco.Entidades.TipoMovimentacao[ idtipoMovimentacao=" + idtipoMovimentacao + " ]";
    }
    
}
