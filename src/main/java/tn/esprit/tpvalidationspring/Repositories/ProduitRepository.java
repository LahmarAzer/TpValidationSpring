package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
