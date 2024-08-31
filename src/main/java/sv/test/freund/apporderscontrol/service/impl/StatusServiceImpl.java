package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.Status;
import sv.test.freund.apporderscontrol.repository.StatusRepository;
import sv.test.freund.apporderscontrol.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public Optional<Status> findProductById(Integer id) {
        return statusRepository.findById(id);
      }

    @Override
    public void CreateStatus(Status status) {
        statusRepository.saveAndFlush(status);
    }

    @Override
    public void updateStatus(Status status) {
        statusRepository.saveAndFlush(status);
    }
}
