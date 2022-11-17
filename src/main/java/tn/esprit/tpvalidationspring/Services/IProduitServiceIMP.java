package tn.esprit.tpvalidationspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpvalidationspring.Entities.Fournisseur;
import tn.esprit.tpvalidationspring.Entities.Produit;
import tn.esprit.tpvalidationspring.Repositories.FournisseurRepository;
import tn.esprit.tpvalidationspring.Repositories.ProduitRepository;

@Service
public class IProduitServiceIMP implements IProduitService{
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit = produitRepository.findById(produitId).orElse(null);
        if (fournisseur != null && produit != null) {
            produit.getFournisseurList().add(fournisseur);
            produitRepository.save(produit);
        }
    }
}
