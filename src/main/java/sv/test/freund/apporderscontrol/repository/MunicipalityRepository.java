package sv.test.freund.apporderscontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.test.freund.apporderscontrol.model.Municipality;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, Integer> {

}
