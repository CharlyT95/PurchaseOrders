package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.Supplier;
import sv.test.freund.apporderscontrol.repository.SupplierRepository;
import sv.test.freund.apporderscontrol.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {


    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> findSupplierById(Integer id) {
        return supplierRepository.findById(id);
    }

    @Override
    public void CreateSupplier(Supplier supplier) {
        supplierRepository.saveAndFlush(supplier);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
       supplierRepository.saveAndFlush(supplier);
    }

}
