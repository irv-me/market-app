package com.tecdesoftware.market.persistence.crud;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


    List<Producto> findByIdCategoriaOrderByNombreAsc(int idcategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);



}
