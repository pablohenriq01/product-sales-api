package github.com.frapodev.productsales.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_client")
    private String nameClient;
    @Column(name = "balance_client")
    private BigDecimal balanceClient;
    @Column(name = "fk_id_products_created")
    @ManyToMany
    private Product productCreated;
    @Column(name = "fk_id_purchased_products")
    @ManyToMany
    private Product purchaseProduct;

    public Client(String nameClient, BigDecimal balanceClient){
        this.nameClient = nameClient;
        this.balanceClient = balanceClient;
    }
    
    
}
