package sv.test.freund.apporderscontrol.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Entity
@Table(name = "Cls_Statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer statusId;

    @NotEmpty(message = "Debe ingresar nombre de estado de orden")
    private String statusName;

    @NotNull(message = "Debe ingresar la informacion solicitada, 1 Activo, 0 Inactivo")
    private Boolean isActive;

    @NotEmpty(message = "Debe ingresar acronimo")
    @Size(min = 1, max = 2)
    private String acronym;

}
