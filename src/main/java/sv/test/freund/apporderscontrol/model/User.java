package sv.test.freund.apporderscontrol.model;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "user_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Pass")
    private String pass;

}