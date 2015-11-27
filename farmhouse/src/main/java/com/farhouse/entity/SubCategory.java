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
@Table(name = "sub_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategory.findAll", query = "SELECT s FROM SubCategory s"),
    @NamedQuery(name = "SubCategory.findBySubCategoryId", query = "SELECT s FROM SubCategory s WHERE s.subCategoryId = :subCategoryId"),
    @NamedQuery(name = "SubCategory.findBySubCategoryName", query = "SELECT s FROM SubCategory s WHERE s.subCategoryName = :subCategoryName")})
public class SubCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sub_category_id")
    private Integer subCategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "sub_category_name")
    private String subCategoryName;
    @JoinColumn(name = "category_id_fk", referencedColumnName = "category_id")
    @ManyToOne(optional = false)
    private Category categoryIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subCategoryIdFk")
    private Collection<Crop> cropCollection;

    public SubCategory() {
    }

    public SubCategory(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public SubCategory(Integer subCategoryId, String subCategoryName) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Category getCategoryIdFk() {
        return categoryIdFk;
    }

    public void setCategoryIdFk(Category categoryIdFk) {
        this.categoryIdFk = categoryIdFk;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Crop> getCropCollection() {
        return cropCollection;
    }

    public void setCropCollection(Collection<Crop> cropCollection) {
        this.cropCollection = cropCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subCategoryId != null ? subCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategory)) {
            return false;
        }
        SubCategory other = (SubCategory) object;
        if ((this.subCategoryId == null && other.subCategoryId != null) || (this.subCategoryId != null && !this.subCategoryId.equals(other.subCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.farhouse.entity.SubCategory[ subCategoryId=" + subCategoryId + " ]";
    }
    
}
