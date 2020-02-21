package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "adminis", path = "adminis")
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
