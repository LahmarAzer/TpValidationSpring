package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
