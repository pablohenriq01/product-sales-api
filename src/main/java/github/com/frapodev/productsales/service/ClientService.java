package github.com.frapodev.productsales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import github.com.frapodev.productsales.model.Client;
import github.com.frapodev.productsales.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    ClientRepository cRepository;
    
    
    public Client registerClientService (@RequestBody Client client){
        return cRepository.save(client);
    }

    public List<Client> listAllClientsService(){
        return cRepository.findAll();
    }
    


}
