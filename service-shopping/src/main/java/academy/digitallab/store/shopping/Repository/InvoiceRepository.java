package academy.digitallab.store.shopping.Repository;

import academy.digitallab.store.shopping.Repository.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByCustomerId(Long customerId );
    Invoice findByNumberInvoice(String numberInvoice);
}
