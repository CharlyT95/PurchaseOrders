package sv.test.freund.apporderscontrol.service;
import java.util.*;
import sv.test.freund.apporderscontrol.model.Status;

public interface StatusService {
    public List<Status> findAll();
    public Optional<Status> findProductById(Integer id);
    public void CreateStatus(Status status);
    public void updateStatus(Status status);
}
