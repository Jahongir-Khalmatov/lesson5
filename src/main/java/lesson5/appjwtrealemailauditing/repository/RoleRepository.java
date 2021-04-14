package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
