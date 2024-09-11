package github.com.frapodev.productsales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Products {
    private Long id;
    private String nameProduct;
    private BigDecimal priceProduct;
}
