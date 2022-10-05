package com.platzi.marketexample.persistence.entity;

import javax.persistence.*;
@Entity
@Table(name = "categorias")
public class Categoria  {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "estado")
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}