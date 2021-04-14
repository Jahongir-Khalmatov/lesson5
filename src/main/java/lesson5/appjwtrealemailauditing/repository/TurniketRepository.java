package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.Turniket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TurniketRepository extends JpaRepository<Turniket, UUID> {
}
