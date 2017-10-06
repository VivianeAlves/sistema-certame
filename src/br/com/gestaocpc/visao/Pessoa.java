/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaocpc.visao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Viviane Alves
 */
@Entity
@Table(name = "pessoa", catalog = "cpc", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findByIdPessoa", query = "SELECT p FROM Pessoa p WHERE p.idPessoa = :idPessoa")
    , @NamedQuery(name = "Pessoa.findByNomePessoa", query = "SELECT p FROM Pessoa p WHERE p.nomePessoa = :nomePessoa")
    , @NamedQuery(name = "Pessoa.findByPaiPessoa", query = "SELECT p FROM Pessoa p WHERE p.paiPessoa = :paiPessoa")
    , @NamedQuery(name = "Pessoa.findByMaePessoa", query = "SELECT p FROM Pessoa p WHERE p.maePessoa = :maePessoa")
    , @NamedQuery(name = "Pessoa.findByDocPessoa", query = "SELECT p FROM Pessoa p WHERE p.docPessoa = :docPessoa")
    , @NamedQuery(name = "Pessoa.findByDataNascPessoa", query = "SELECT p FROM Pessoa p WHERE p.dataNascPessoa = :dataNascPessoa")
    , @NamedQuery(name = "Pessoa.findByUfDocPessoa", query = "SELECT p FROM Pessoa p WHERE p.ufDocPessoa = :ufDocPessoa")
    , @NamedQuery(name = "Pessoa.findByCpfPessoa", query = "SELECT p FROM Pessoa p WHERE p.cpfPessoa = :cpfPessoa")
    , @NamedQuery(name = "Pessoa.findByCepPessoa", query = "SELECT p FROM Pessoa p WHERE p.cepPessoa = :cepPessoa")
    , @NamedQuery(name = "Pessoa.findByLogradouroPessoa", query = "SELECT p FROM Pessoa p WHERE p.logradouroPessoa = :logradouroPessoa")
    , @NamedQuery(name = "Pessoa.findByNumeroPessoa", query = "SELECT p FROM Pessoa p WHERE p.numeroPessoa = :numeroPessoa")
    , @NamedQuery(name = "Pessoa.findByBairroPessoa", query = "SELECT p FROM Pessoa p WHERE p.bairroPessoa = :bairroPessoa")
    , @NamedQuery(name = "Pessoa.findByCidadePessoa", query = "SELECT p FROM Pessoa p WHERE p.cidadePessoa = :cidadePessoa")
    , @NamedQuery(name = "Pessoa.findByUfPessoa", query = "SELECT p FROM Pessoa p WHERE p.ufPessoa = :ufPessoa")
    , @NamedQuery(name = "Pessoa.findBySexoPessoa", query = "SELECT p FROM Pessoa p WHERE p.sexoPessoa = :sexoPessoa")
    , @NamedQuery(name = "Pessoa.findBySenhaPessoa", query = "SELECT p FROM Pessoa p WHERE p.senhaPessoa = :senhaPessoa")})
public class Pessoa implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pessoa")
    private Integer idPessoa;
    @Basic(optional = false)
    @Column(name = "nome_pessoa")
    private String nomePessoa;
    @Column(name = "pai_pessoa")
    private String paiPessoa;
    @Column(name = "mae_pessoa")
    private String maePessoa;
    @Column(name = "doc_pessoa")
    private String docPessoa;
    @Column(name = "data_nasc_pessoa")
    @Temporal(TemporalType.DATE)
    private Date dataNascPessoa;
    @Column(name = "uf_doc_pessoa")
    private String ufDocPessoa;
    @Column(name = "cpf_pessoa")
    private String cpfPessoa;
    @Column(name = "cep_pessoa")
    private String cepPessoa;
    @Column(name = "logradouro_pessoa")
    private String logradouroPessoa;
    @Column(name = "numero_pessoa")
    private String numeroPessoa;
    @Column(name = "bairro_pessoa")
    private String bairroPessoa;
    @Column(name = "cidade_pessoa")
    private String cidadePessoa;
    @Column(name = "uf_pessoa")
    private String ufPessoa;
    @Column(name = "sexo_pessoa")
    private Character sexoPessoa;
    @Column(name = "senha_pessoa")
    private String senhaPessoa;

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Pessoa(Integer idPessoa, String nomePessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        Integer oldIdPessoa = this.idPessoa;
        this.idPessoa = idPessoa;
        changeSupport.firePropertyChange("idPessoa", oldIdPessoa, idPessoa);
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        String oldNomePessoa = this.nomePessoa;
        this.nomePessoa = nomePessoa;
        changeSupport.firePropertyChange("nomePessoa", oldNomePessoa, nomePessoa);
    }

    public String getPaiPessoa() {
        return paiPessoa;
    }

    public void setPaiPessoa(String paiPessoa) {
        String oldPaiPessoa = this.paiPessoa;
        this.paiPessoa = paiPessoa;
        changeSupport.firePropertyChange("paiPessoa", oldPaiPessoa, paiPessoa);
    }

    public String getMaePessoa() {
        return maePessoa;
    }

    public void setMaePessoa(String maePessoa) {
        String oldMaePessoa = this.maePessoa;
        this.maePessoa = maePessoa;
        changeSupport.firePropertyChange("maePessoa", oldMaePessoa, maePessoa);
    }

    public String getDocPessoa() {
        return docPessoa;
    }

    public void setDocPessoa(String docPessoa) {
        String oldDocPessoa = this.docPessoa;
        this.docPessoa = docPessoa;
        changeSupport.firePropertyChange("docPessoa", oldDocPessoa, docPessoa);
    }

    public Date getDataNascPessoa() {
        return dataNascPessoa;
    }

    public void setDataNascPessoa(Date dataNascPessoa) {
        Date oldDataNascPessoa = this.dataNascPessoa;
        this.dataNascPessoa = dataNascPessoa;
        changeSupport.firePropertyChange("dataNascPessoa", oldDataNascPessoa, dataNascPessoa);
    }

    public String getUfDocPessoa() {
        return ufDocPessoa;
    }

    public void setUfDocPessoa(String ufDocPessoa) {
        String oldUfDocPessoa = this.ufDocPessoa;
        this.ufDocPessoa = ufDocPessoa;
        changeSupport.firePropertyChange("ufDocPessoa", oldUfDocPessoa, ufDocPessoa);
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        String oldCpfPessoa = this.cpfPessoa;
        this.cpfPessoa = cpfPessoa;
        changeSupport.firePropertyChange("cpfPessoa", oldCpfPessoa, cpfPessoa);
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        String oldCepPessoa = this.cepPessoa;
        this.cepPessoa = cepPessoa;
        changeSupport.firePropertyChange("cepPessoa", oldCepPessoa, cepPessoa);
    }

    public String getLogradouroPessoa() {
        return logradouroPessoa;
    }

    public void setLogradouroPessoa(String logradouroPessoa) {
        String oldLogradouroPessoa = this.logradouroPessoa;
        this.logradouroPessoa = logradouroPessoa;
        changeSupport.firePropertyChange("logradouroPessoa", oldLogradouroPessoa, logradouroPessoa);
    }

    public String getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(String numeroPessoa) {
        String oldNumeroPessoa = this.numeroPessoa;
        this.numeroPessoa = numeroPessoa;
        changeSupport.firePropertyChange("numeroPessoa", oldNumeroPessoa, numeroPessoa);
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        String oldBairroPessoa = this.bairroPessoa;
        this.bairroPessoa = bairroPessoa;
        changeSupport.firePropertyChange("bairroPessoa", oldBairroPessoa, bairroPessoa);
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        String oldCidadePessoa = this.cidadePessoa;
        this.cidadePessoa = cidadePessoa;
        changeSupport.firePropertyChange("cidadePessoa", oldCidadePessoa, cidadePessoa);
    }

    public String getUfPessoa() {
        return ufPessoa;
    }

    public void setUfPessoa(String ufPessoa) {
        String oldUfPessoa = this.ufPessoa;
        this.ufPessoa = ufPessoa;
        changeSupport.firePropertyChange("ufPessoa", oldUfPessoa, ufPessoa);
    }

    public Character getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(Character sexoPessoa) {
        Character oldSexoPessoa = this.sexoPessoa;
        this.sexoPessoa = sexoPessoa;
        changeSupport.firePropertyChange("sexoPessoa", oldSexoPessoa, sexoPessoa);
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        String oldSenhaPessoa = this.senhaPessoa;
        this.senhaPessoa = senhaPessoa;
        changeSupport.firePropertyChange("senhaPessoa", oldSenhaPessoa, senhaPessoa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gestaocpc.visao.Pessoa[ idPessoa=" + idPessoa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
