package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.Municipality;
import sv.test.freund.apporderscontrol.repository.MunicipalityRepository;
import sv.test.freund.apporderscontrol.service.MunicipalityService;

@Service
public class MunicipalityServiceImpl implements MunicipalityService  {
    
    
    @Autowired
    private MunicipalityRepository municipalityRepository;

    @Override
    public List<Municipality> findAll() {
        return municipalityRepository.findAll();
    }

    @Override
    public Optional<Municipality> findById(Integer id) {
       return municipalityRepository.findById(id);
    }
}
