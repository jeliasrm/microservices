package academy.digitallab.store.customer.Repository;

import academy.digitallab.store.customer.Repository.Entity.Customer;
import academy.digitallab.store.customer.Repository.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByNumberID(String numberID);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByRegion(Region region);
}
