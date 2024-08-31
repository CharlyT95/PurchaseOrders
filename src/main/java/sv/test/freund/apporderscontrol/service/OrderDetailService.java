package sv.test.freund.apporderscontrol.service;

import java.util.*;

import sv.test.freund.apporderscontrol.model.OrderDetail;

public interface OrderDetailService {
    public List<OrderDetail> findAll();
    public Optional<OrderDetail> findOrderDetailtById(Integer id);
    public void CreateOrderDetail(OrderDetail detail);
    public void updateOrderDetail(OrderDetail detail);
    public List<OrderDetail> findOrderDetailByOrderId(Integer id);
}
