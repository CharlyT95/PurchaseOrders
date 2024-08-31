package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.OrderDetail;
import sv.test.freund.apporderscontrol.repository.OrderDetailRepository;
import sv.test.freund.apporderscontrol.service.OrderDetailService;

@Service
public class OrderDetailImpl implements OrderDetailService {


    @Autowired
    private OrderDetailRepository orderdetailRepository;


    @Override
    public List<OrderDetail> findAll() {
        return orderdetailRepository.findAll();
    }

    @Override
    public Optional<OrderDetail> findOrderDetailtById(Integer id) {
       return orderdetailRepository.findById(id);
    }

    @Override
    public void CreateOrderDetail(OrderDetail detail) {
        orderdetailRepository.saveAndFlush(detail);
    }

    @Override
    public void updateOrderDetail(OrderDetail detail) {
        orderdetailRepository.saveAndFlush(detail);
    }

    @Override
    public List<OrderDetail> findOrderDetailByOrderId(Integer id)
    {
        return orderdetailRepository.findByPurchaseOrder_OrderId(id);
    }

}
