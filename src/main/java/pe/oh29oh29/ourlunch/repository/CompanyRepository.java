package pe.oh29oh29.ourlunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.oh29oh29.ourlunch.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
}
