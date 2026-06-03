package episs.unaj.com.crudvendedor.repository;

import episs.unaj.com.crudvendedor.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceRepository extends JpaRepository<Vendedor, Long> {
}
