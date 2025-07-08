package com.tecdesoftware.market_app.persistence.crud;
import com.tecdesoftware.market_app.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Query methods
    // Por medio del nombre del metodo genera una query en SQL (no lo vemos)
    /*
        SELECT *
        FROM Categoria
        WHERE id_categoria = ?
        ORDER BY Nombre ASC
    */
    // Obtiene una lista de productos filtrada por id de categoria y ordenados ascendentemente por nombre

    // Obtener los productos escasos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}