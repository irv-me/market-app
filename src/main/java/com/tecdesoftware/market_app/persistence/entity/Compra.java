package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name="compras")

public class Compra {
    @Id //es la llave primaria
    //Autogenera ids autoincrementables
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private int idCompra;

    @Column(name="id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
}
