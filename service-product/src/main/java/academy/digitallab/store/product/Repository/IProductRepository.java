package academy.digitallab.store.product.Repository;

import academy.digitallab.store.product.Entity.Category;
import academy.digitallab.store.product.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);
    List<Product> findByName(Category category);

}
