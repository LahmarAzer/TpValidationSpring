package tn.esprit.tpvalidationspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpvalidationspring.Entities.Fournisseur;
import tn.esprit.tpvalidationspring.Entities.Produit;
import tn.esprit.tpvalidationspring.Repositories.FournisseurRepository;
import tn.esprit.tpvalidationspring.Repositories.ProduitRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class IFournisseurServiceIMP implements IFournisseurService{
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }






}
