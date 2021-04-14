package lesson5.appjwtrealemailauditing.repository;

import lesson5.appjwtrealemailauditing.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
