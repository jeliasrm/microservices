package academy.digitallab.store.product.Service;

import academy.digitallab.store.product.Entity.Category;
import academy.digitallab.store.product.Entity.Product;

import java.util.List;


public interface IProductService {

    List<Product> listAllProduct();
    Product getProduct(Long id);

    Product createProduct(Product product);
    Product updateProduct(Product product);
    Product deleteProduct(Long id);
    List<Product> findByCategory(Category category);
    Product updateStock(Long id, Double quantity);
}
