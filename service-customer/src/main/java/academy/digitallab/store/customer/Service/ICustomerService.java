package academy.digitallab.store.customer.Service;

import academy.digitallab.store.customer.Repository.Entity.Customer;
import academy.digitallab.store.customer.Repository.Entity.Region;

import java.util.List;

public interface ICustomerService {

    List<Customer> findCustomerAll();
    List<Customer> findCustomerByRegion(Region region);

    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    Customer deleteCustomer(Customer customer);
    Customer getCustomer(Long id);

}
