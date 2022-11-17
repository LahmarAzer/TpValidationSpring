package tn.esprit.tpvalidationspring.Services;

import tn.esprit.tpvalidationspring.Entities.Fournisseur;
import tn.esprit.tpvalidationspring.Entities.Produit;

public interface IProduitService {
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;


}
