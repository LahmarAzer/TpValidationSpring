package tn.esprit.tpvalidationspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpvalidationspring.Entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
