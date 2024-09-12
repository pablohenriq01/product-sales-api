package github.com.frapodev.productsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.frapodev.productsales.model.Client;
import github.com.frapodev.productsales.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
   
    @Autowired
    private ClientService clientService;
    
    @GetMapping("/register")
    public Client registerClients(@RequestBody Client client){

        return clientService.registerClientService(client);
    }
}
