package com.platzi.marketexample.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Compra idCompra;

    @Column(name = "id_producto")
    private Producto idProducto;

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

    @Override
    public String toString() {
        return "ComprasProductoPK{" +
                "idCompra=" + idCompra +
                ", idProducto=" + idProducto +
                '}';
    }
}
