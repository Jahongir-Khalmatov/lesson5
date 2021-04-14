package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
