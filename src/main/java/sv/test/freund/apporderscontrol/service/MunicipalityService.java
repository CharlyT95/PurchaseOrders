package sv.test.freund.apporderscontrol.service;

import java.util.List;
import java.util.Optional;

import sv.test.freund.apporderscontrol.model.Municipality;

public interface MunicipalityService {
    public List<Municipality> findAll();
    public Optional<Municipality> findById(Integer id);
}
