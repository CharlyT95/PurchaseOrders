package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Cls_Departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    private String departmentName;

    //private LocalDateTime created;
}
