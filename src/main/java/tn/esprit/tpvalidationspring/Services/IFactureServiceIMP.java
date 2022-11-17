package tn.esprit.tpvalidationspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpvalidationspring.Entities.Client;
import tn.esprit.tpvalidationspring.Entities.Facture;
import tn.esprit.tpvalidationspring.Repositories.ClientRepository;
import tn.esprit.tpvalidationspring.Repositories.FactureRepository;

import java.util.List;

@Service
public class IFactureServiceIMP implements IFactureService{
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Facture update(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public void delete(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public Facture add(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public List<Facture> getall() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getone(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

   /* @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c=clientRepository.findById(idClient).orElse(null);
        return factureRepository.getFacturesByClient(c);
    }*/
}
