package tn.esprit.tpvalidationspring.Services;

import tn.esprit.tpvalidationspring.Entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    public List<Fournisseur> retrieveAllFournisseurs();
    public Fournisseur addFournisseur(Fournisseur f);
    public void deleteFournisseur(Long id);
    public Fournisseur updateFournisseur(Fournisseur f);
    public Fournisseur retrieveFournisseur(Long id);

}
