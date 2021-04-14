package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.TurniketHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TurniketHistoryRepository extends JpaRepository<TurniketHistory, UUID> {
}
