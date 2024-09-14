package github.com.frapodev.productsales.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import github.com.frapodev.productsales.model.Client;
import github.com.frapodev.productsales.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    ClientRepository cRepository;
    
    
    public Client saveClient (Client client){
        return cRepository.save(client);
    }

    public List<Client> listAllClientsService(){
        return cRepository.findAll();
    }
    
    public Client findByIDService(Long id){
        return cRepository.findById(id).get();
    }

    public void deleteClientService(Client client){
        cRepository.deleteById(client.getId());
    }

    public ResponseEntity<Client> clientUpdateService(@PathVariable("id") Long id, @RequestBody Client client) {
    Client existingClient = findByIDService(id);
    if (existingClient == null) {
        return ResponseEntity.notFound().build();
    }

    existingClient.setNameClient(client.getNameClient());

    saveClient(existingClient);

    return ResponseEntity.ok(existingClient);
    }

}
