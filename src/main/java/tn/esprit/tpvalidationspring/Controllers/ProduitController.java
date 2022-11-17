package tn.esprit.tpvalidationspring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpvalidationspring.Services.IProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    IProduitService iProduitService;


    @PostMapping("/assignFP/{idF}/{idP}")
    public void AssignFournisseurToEtudiant(@PathVariable Long idF , @PathVariable Long idP){
        iProduitService.assignFournisseurToProduit(idF, idP);
    }
}
