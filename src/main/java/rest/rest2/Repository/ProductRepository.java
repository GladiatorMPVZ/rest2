package rest.rest2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.rest2.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
