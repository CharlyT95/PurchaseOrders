package sv.test.freund.apporderscontrol.service;
import java.util.*;
import sv.test.freund.apporderscontrol.model.Supplier;

public interface SupplierService {

    public List<Supplier> findAll();
    public Optional<Supplier> findSupplierById(Integer id);
    public void CreateSupplier(Supplier supplier);
    public void updateSupplier(Supplier supplier);


}
