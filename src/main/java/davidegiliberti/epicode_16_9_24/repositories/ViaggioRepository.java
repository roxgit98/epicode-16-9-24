package davidegiliberti.epicode_16_9_24.repositories;

import davidegiliberti.epicode_16_9_24.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Long> {
}
