package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
