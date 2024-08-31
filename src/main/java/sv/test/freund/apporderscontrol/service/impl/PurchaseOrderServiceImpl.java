package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.PurchaseOrder;
import sv.test.freund.apporderscontrol.repository.PurchaseOrderRepository;
import sv.test.freund.apporderscontrol.service.PurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {


    @Autowired
    private PurchaseOrderRepository purchaseorderRepository;

    @Override
    public List<PurchaseOrder> findAll() {
        return purchaseorderRepository.findAll();
    }

    @Override
    public Optional<PurchaseOrder> findPurchaseOrderById(Integer id) {
       return purchaseorderRepository.findById(id);
    }

    @Override
    public void CreatePurchaseOrder(PurchaseOrder order) {
        purchaseorderRepository.saveAndFlush(order);
    }

    @Override
    public void updatePurchaseOrder(PurchaseOrder order) {
        purchaseorderRepository.saveAndFlush(order);
    }

}
