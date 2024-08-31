package sv.test.freund.apporderscontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.test.freund.apporderscontrol.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserName(String userName);
}
