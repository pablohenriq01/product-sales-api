package github.com.frapodev.productsales.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import github.com.frapodev.productsales.model.Client;
import github.com.frapodev.productsales.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    ClientRepository cRepository;
    
    
    public Client registerClientService (Client client){
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


}
