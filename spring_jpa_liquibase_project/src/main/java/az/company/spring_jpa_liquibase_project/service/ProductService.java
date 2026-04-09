package az.company.spring_jpa_liquibase_project.service;

import az.company.spring_jpa_liquibase_project.dao.entity.ProductEntity;
import az.company.spring_jpa_liquibase_project.dao.repository.ProductReposiyory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
   private final ProductReposiyory productReposiyory;
   private final EntityManager em;

   public void test() {
       ProductEntity productEntity = em.find(ProductEntity.class, 1L);
       em.close();
   }

   public void createProduct(ProductEntity entity){
       ProductEntity productEntity = new ProductEntity();
       productReposiyory.save(productEntity);
   }

   public Optional<ProductEntity> getProductById(Long id){
       return productReposiyory.findById(id);
   }

   public void deleteProductById(Long id){
       productReposiyory.deleteById(id);
   }
}
