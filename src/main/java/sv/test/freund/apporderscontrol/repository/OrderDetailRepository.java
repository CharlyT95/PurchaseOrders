package sv.test.freund.apporderscontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.test.freund.apporderscontrol.model.OrderDetail;
import java.util.*;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByPurchaseOrder_OrderId(Integer id); 

}
