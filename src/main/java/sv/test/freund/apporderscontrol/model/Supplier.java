package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "Suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;

    @NotEmpty(message = "Debe ingresar nombre de proveedor")
    private String supplierName;

    @Email(message = "Correo no es valido", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotEmpty(message = "Correo no puede ir vacio")
    private String email;

    @Size(min=8,max=8, message = "El telefono debe tener 8 digitos")
    private String phone;
    private String supplierAddress;

    @OneToOne
    @JoinColumn(name = "municipalityId")
    private Municipality municipality;

}
