package github.com.frapodev.productsales.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

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
    @ManyToMany
    @Column(name = "fk_id_products_created")
    private List<Product> productCreated;
    @ManyToMany
    @Column(name = "fk_id_purchased_products")
    private List<Product> purchaseProduct;
    
}
