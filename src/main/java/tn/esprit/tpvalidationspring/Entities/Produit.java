package tn.esprit.tpvalidationspring.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;

    @ManyToMany
    private List<Fournisseur> fournisseurList;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;

    @OneToMany
    private List<DetailFacture> detailFactureList;
}
