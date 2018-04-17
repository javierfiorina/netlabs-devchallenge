package gdc;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gdc.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	Optional<Producto> findByNombre(String nombre);
}