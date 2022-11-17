package tn.esprit.tpvalidationspring.Services;

import tn.esprit.tpvalidationspring.Entities.Facture;

import java.util.List;

public interface IFactureService {

        public Facture update(Facture f);
        public void delete(Long id);
        public Facture add(Facture f);
        public List<Facture> getall();
        public Facture getone(Long id);
        /*public List<Facture> getFacturesByClient(Long idClient);*/
    }


