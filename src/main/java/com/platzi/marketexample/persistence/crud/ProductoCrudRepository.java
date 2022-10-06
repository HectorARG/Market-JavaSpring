package com.platzi.marketexample.persistence.crud;

import com.platzi.marketexample.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {

    Optional<List<Producto>> findByPrecioVentaLessThanAndIdCategoriaOrderByNombreAsc(int precioVenta, int idCategoria);

}
