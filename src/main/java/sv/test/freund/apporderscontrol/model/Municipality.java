package sv.test.freund.apporderscontrol.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Cls_Municipalities")
public class Municipality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer municipalityId;

    private String municipalityName;

    
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    //private LocalDateTime created;
}
