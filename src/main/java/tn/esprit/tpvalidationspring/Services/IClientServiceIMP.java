package tn.esprit.tpvalidationspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpvalidationspring.Entities.Client;
import tn.esprit.tpvalidationspring.Repositories.ClientRepository;

import java.util.List;

@Service
public class IClientServiceIMP implements IClientService {
    @Autowired
    private ClientRepository cientRepository;
    @Override
    public Client update(Client c) {
        return cientRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        cientRepository.deleteById(id);

    }

    @Override
    public Client add(Client c) {
        return cientRepository.save(c);
    }

    @Override
    public List<Client> getall() {
        return cientRepository.findAll();
    }

    @Override
    public Client getone(Long id) {
        return cientRepository.findById(id).orElse(null);
    }
}
