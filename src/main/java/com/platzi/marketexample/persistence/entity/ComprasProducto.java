package com.platzi.marketexample.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @ManyToOne
    private Compra idCompra;

    @ManyToOne
    private Producto idProducto;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ComprasProducto{" +
                "idCompra=" + idCompra +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", total=" + total +
                ", estado=" + estado +
                '}';
    }
}
