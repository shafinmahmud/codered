/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farhouse.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.stereotype.Component;

/**
 *
 * @author SHAFIN
 */
@Component
@Entity
@Table(name = "division")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Division.findAll", query = "SELECT d FROM Division d"),
    @NamedQuery(name = "Division.findByDivisionId", query = "SELECT d FROM Division d WHERE d.divisionId = :divisionId"),
    @NamedQuery(name = "Division.findByDivisionName", query = "SELECT d FROM Division d WHERE d.divisionName = :divisionName")})
public class Division implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "division_id")
    private Integer divisionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "division_name")
    private String divisionName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "divisionIdFk")
    private Collection<District> districtCollection;

    public Division() {
    }

    public Division(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Division(Integer divisionId, String divisionName) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<District> getDistrictCollection() {
        return districtCollection;
    }

    public void setDistrictCollection(Collection<District> districtCollection) {
        this.districtCollection = districtCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (divisionId != null ? divisionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Division)) {
            return false;
        }
        Division other = (Division) object;
        if ((this.divisionId == null && other.divisionId != null) || (this.divisionId != null && !this.divisionId.equals(other.divisionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.farhouse.entity.Division[ divisionId=" + divisionId + " ]";
    }
    
}
