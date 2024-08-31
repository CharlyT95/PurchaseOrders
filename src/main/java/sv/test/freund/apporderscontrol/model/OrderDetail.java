package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailId;

    @ManyToOne()
    @JoinColumn(name = "OrderId")
    @NotNull(message = "Seleccionar orden de compra a relacionar detalle")
    private PurchaseOrder purchaseOrder;
    
    @NotNull(message = "Seleccionar producto")
    @OneToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    @NotNull(message = "Ingresar la cantidad de productos")
    private Integer quantity;
}
