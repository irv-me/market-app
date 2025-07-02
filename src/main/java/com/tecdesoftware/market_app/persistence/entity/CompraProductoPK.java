package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

// Para unir las 2 llaves y crear una llave compuesta
@Embeddable

public class CompraProductoPK implements Serializable {
    @Id
    @Column(name = "id_compra")
    private int idCompra;

    @Column (name = "Id_producto")
    private int idProducto;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
}
