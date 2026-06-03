package episs.unaj.com.crudproductoer.repository;

import episs.unaj.com.crudproductoer.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
