package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
