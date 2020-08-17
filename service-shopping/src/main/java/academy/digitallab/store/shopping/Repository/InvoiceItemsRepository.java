package academy.digitallab.store.shopping.Repository;

import academy.digitallab.store.shopping.Repository.Entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
