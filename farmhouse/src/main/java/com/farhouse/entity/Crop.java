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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "crop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crop.findAll", query = "SELECT c FROM Crop c"),
    @NamedQuery(name = "Crop.findByCropId", query = "SELECT c FROM Crop c WHERE c.cropId = :cropId"),
    @NamedQuery(name = "Crop.findByCropName", query = "SELECT c FROM Crop c WHERE c.cropName = :cropName")})
public class Crop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "crop_id")
    private Integer cropId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "crop_name")
    private String cropName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cropIdFk")
    private Collection<Product> productCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cropIdFk")
    private Collection<Rating> ratingCollection;
    @JoinColumn(name = "sub_category_id_fk", referencedColumnName = "sub_category_id")
    @ManyToOne(optional = false)
    private SubCategory subCategoryIdFk;

    public Crop() {
    }

    public Crop(Integer cropId) {
        this.cropId = cropId;
    }

    public Crop(Integer cropId, String cropName) {
        this.cropId = cropId;
        this.cropName = cropName;
    }

    public Integer getCropId() {
        return cropId;
    }

    public void setCropId(Integer cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Rating> getRatingCollection() {
        return ratingCollection;
    }

    public void setRatingCollection(Collection<Rating> ratingCollection) {
        this.ratingCollection = ratingCollection;
    }

    public SubCategory getSubCategoryIdFk() {
        return subCategoryIdFk;
    }

    public void setSubCategoryIdFk(SubCategory subCategoryIdFk) {
        this.subCategoryIdFk = subCategoryIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cropId != null ? cropId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crop)) {
            return false;
        }
        Crop other = (Crop) object;
        if ((this.cropId == null && other.cropId != null) || (this.cropId != null && !this.cropId.equals(other.cropId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.farhouse.entity.Crop[ cropId=" + cropId + " ]";
    }
    
}
