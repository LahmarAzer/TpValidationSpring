package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
