package tn.esprit.tpvalidationspring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpvalidationspring.Entities.Fournisseur;
import tn.esprit.tpvalidationspring.Services.IFournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {

    @Autowired
    IFournisseurService iFournisseurService ;

    @GetMapping("/getallF")
    public List<Fournisseur> getAllFournisseurs(){
        return iFournisseurService.retrieveAllFournisseurs();
    }
    @GetMapping("/getF/{id}")
    public Fournisseur getFournisseur(@PathVariable Long id){
        return iFournisseurService.retrieveFournisseur(id);
    }
    @PostMapping("/addF")
    public Fournisseur AddFournisseur(@RequestBody Fournisseur f){
        return iFournisseurService.addFournisseur(f);
    }
    @PutMapping("/updateF")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f){
        return iFournisseurService.updateFournisseur(f);
    }
    @DeleteMapping("/deleteF/{id}")
    public void deleteFournisseur(@PathVariable Long id){
        iFournisseurService.deleteFournisseur(id);
    }


}
