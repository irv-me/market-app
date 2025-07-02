package com.tecdesoftware.market_app.persistence;
import com.tecdesoftware.market_app.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market_app.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//esta anotacion le dice a spring que este archivo se enlaza con la bd
@Repository
public class ProductoRepository
{
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner SELECT * FROM productos
    public List<Producto> getAll() {
        //Se castea de iterable a lista
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNameAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);

    }

    //obtener un producto dado el id
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //guardar un producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //Eliminar producto por Id
    public void delete(int IdProducto) {
        productoCrudRepository.deleteById(IdProducto);
    }




}