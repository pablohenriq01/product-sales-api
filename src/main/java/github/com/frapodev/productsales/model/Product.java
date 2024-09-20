package github.com.frapodev.productsales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "price_product")
    private BigDecimal priceProduct;
    @Column(name = "creation_date")
    private LocalDate creationDate = LocalDate.now();
    @ManyToOne
    @Column(name = "fk_id_creator_product")
    private List<Product> creatorProduct ;
}
