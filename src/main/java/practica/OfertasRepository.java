package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ofertas", path = "ofertas")
public interface OfertasRepository extends JpaRepository<Ofertas, Long> {
}
