/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebas
 */
@Entity
@Table(name = "transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findById", query = "SELECT t FROM Transaccion t WHERE t.id = :id")
    , @NamedQuery(name = "Transaccion.findByTipodocumento", query = "SELECT t FROM Transaccion t WHERE t.tipodocumento = :tipodocumento")
    , @NamedQuery(name = "Transaccion.findByDocumento", query = "SELECT t FROM Transaccion t WHERE t.documento = :documento")
    , @NamedQuery(name = "Transaccion.findByNombre", query = "SELECT t FROM Transaccion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Transaccion.findByEmail", query = "SELECT t FROM Transaccion t WHERE t.email = :email")
    , @NamedQuery(name = "Transaccion.findByNumerotarjeta", query = "SELECT t FROM Transaccion t WHERE t.numerotarjeta = :numerotarjeta")
    , @NamedQuery(name = "Transaccion.findByCodigocvv", query = "SELECT t FROM Transaccion t WHERE t.codigocvv = :codigocvv")
    , @NamedQuery(name = "Transaccion.findByTipotarjeta", query = "SELECT t FROM Transaccion t WHERE t.tipotarjeta = :tipotarjeta")
    , @NamedQuery(name = "Transaccion.findByValortransaccion", query = "SELECT t FROM Transaccion t WHERE t.valortransaccion = :valortransaccion")
    , @NamedQuery(name = "Transaccion.findByFechavemcimiento", query = "SELECT t FROM Transaccion t WHERE t.fechavemcimiento = :fechavemcimiento")
    , @NamedQuery(name = "Transaccion.findByFechatransaccion", query = "SELECT t FROM Transaccion t WHERE t.fechatransaccion = :fechatransaccion")})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tipodocumento")
    private String tipodocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "documento")
    private int documento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numerotarjeta")
    private int numerotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigocvv")
    private int codigocvv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipotarjeta")
    private String tipotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valortransaccion")
    private int valortransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechavemcimiento")
    @Temporal(TemporalType.DATE)
    private Date fechavemcimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechatransaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatransaccion;

    public Transaccion() {
    }

    public Transaccion(Integer id) {
        this.id = id;
    }

    public Transaccion(Integer id, String tipodocumento, int documento, String nombre, String email, int numerotarjeta, int codigocvv, String tipotarjeta, int valortransaccion, Date fechavemcimiento, Date fechatransaccion) {
        this.id = id;
        this.tipodocumento = tipodocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
        this.numerotarjeta = numerotarjeta;
        this.codigocvv = codigocvv;
        this.tipotarjeta = tipotarjeta;
        this.valortransaccion = valortransaccion;
        this.fechavemcimiento = fechavemcimiento;
        this.fechatransaccion = fechatransaccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(int numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public int getCodigocvv() {
        return codigocvv;
    }

    public void setCodigocvv(int codigocvv) {
        this.codigocvv = codigocvv;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    public int getValortransaccion() {
        return valortransaccion;
    }

    public void setValortransaccion(int valortransaccion) {
        this.valortransaccion = valortransaccion;
    }

    public Date getFechavemcimiento() {
        return fechavemcimiento;
    }

    public void setFechavemcimiento(Date fechavemcimiento) {
        this.fechavemcimiento = fechavemcimiento;
    }

    public Date getFechatransaccion() {
        return fechatransaccion;
    }

    public void setFechatransaccion(Date fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
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
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Transaccion[ id=" + id + " ]";
    }
    
}
