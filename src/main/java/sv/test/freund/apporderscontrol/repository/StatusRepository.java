package sv.test.freund.apporderscontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.test.freund.apporderscontrol.model.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {

}
