package com.tecdesoftware.market_app.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table (name="productos")

public class Producto {

    @Id //es la llave primaria
    //Autogenera ids autoincrementables
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private int idProducto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="id_categoria")
    private Integer idCategoria;

    @Column(name="codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Integer precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
