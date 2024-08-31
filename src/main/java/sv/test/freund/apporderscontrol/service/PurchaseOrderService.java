package sv.test.freund.apporderscontrol.service;

import sv.test.freund.apporderscontrol.model.PurchaseOrder;
import java.util.*;

public interface PurchaseOrderService {
    public List<PurchaseOrder> findAll();
    public Optional<PurchaseOrder> findPurchaseOrderById(Integer id);
    public void CreatePurchaseOrder(PurchaseOrder order);
    public void updatePurchaseOrder(PurchaseOrder order);
}
