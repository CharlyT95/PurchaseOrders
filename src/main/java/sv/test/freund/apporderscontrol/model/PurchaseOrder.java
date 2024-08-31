package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Entity
@Table(name = "PurchaseOrders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    @NotEmpty(message = "Debe seleccionar Proveedor")
    private Supplier supplier;

    @CreationTimestamp
    @JsonIgnoreProperties
    @Column(updatable = false)
    private LocalDateTime creationDate;

    @NotEmpty(message = "Colocar fecha de entrega")
    private LocalDate availabilityDate;

    @OneToOne
    @JoinColumn(name = "statusId")
    private Status status;

    @JsonIgnoreProperties
    @Column(updatable = false)
    @Value("${valor.defecto:0.00}")
    private Double total;
}
