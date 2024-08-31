package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @NotEmpty(message = "Es obligatorio el nombre del producto, por favor ingresar la información")
    private String productName;

    @DecimalMin("0.00") 
    private Double price;

    @NotEmpty(message = "Debe ingresar descripcion del producto")
    private String productDescr;

}
