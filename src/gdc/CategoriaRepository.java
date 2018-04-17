package gdc;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import gdc.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	Optional<Categoria> findByNombre(String nombre);

}