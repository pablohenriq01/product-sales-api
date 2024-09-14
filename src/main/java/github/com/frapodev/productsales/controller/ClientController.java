package github.com.frapodev.productsales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import github.com.frapodev.productsales.model.Client;
import github.com.frapodev.productsales.service.ClientService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/client")
public class ClientController {
   
    @Autowired
    private ClientService clientService;

    @PostMapping("/register")
    public Client registerClients(@RequestBody Client client){

        return clientService.saveClient(client);
    }

    @GetMapping
    public List<Client> listAllClients() {
        return clientService.listAllClientsService();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Client> findByID(@PathVariable("id") Long id) {
        Client entity = clientService.findByIDService(id);
        return ResponseEntity.ok(entity);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Client client) {
    
        clientService.deleteClientService(client);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Client> clientUpdate(@PathVariable("id") Long id, @RequestBody Client client) {
    Client existingClient = clientService.findByIDService(id);
    if (existingClient == null) {
        return ResponseEntity.notFound().build();
    }

    existingClient.setNameClient(client.getNameClient());

    clientService.saveClient(existingClient);

    return ResponseEntity.ok(existingClient);
}

}
