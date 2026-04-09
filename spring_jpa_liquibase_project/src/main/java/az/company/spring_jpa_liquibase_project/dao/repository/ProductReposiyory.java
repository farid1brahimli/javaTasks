package az.company.spring_jpa_liquibase_project.dao.repository;

import az.company.spring_jpa_liquibase_project.dao.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductReposiyory extends CrudRepository<ProductEntity,Long> {
}
