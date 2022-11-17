package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.DetailProduit;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}
