package tn.esprit.tpvalidationspring.Services;

import tn.esprit.tpvalidationspring.Entities.Client;

import java.util.List;

public interface IClientService {
    public Client update(Client c);
    public void delete(Long id);
    public Client add(Client c);
    public List<Client> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public Client getone(Long id);
}
