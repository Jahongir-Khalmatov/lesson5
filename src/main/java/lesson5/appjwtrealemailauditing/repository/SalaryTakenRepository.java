package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.SalaryTaken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalaryTakenRepository extends JpaRepository<SalaryTaken, UUID> {
}
