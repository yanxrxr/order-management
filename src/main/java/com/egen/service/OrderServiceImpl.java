package com.egen.service;

import com.egen.exception.OrderNotFoundException;
import com.egen.model.Order;
import com.egen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Order getOrderById(String orderId) {
        Order order = orderRepository.getOrderById(orderId);
        if (order == null) {
            throw  new OrderNotFoundException(" Order with id: " + orderId + "NOT FOUND");
        } else {
            return order;
        }
    }

    @Override
    public List<Order> getAllOrdersWithinInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        List<Order> orderList = orderRepository.getAllOrdersWithinInterval(startTime, endTime);
        if (orderList == null || orderList.size() == 0) {
            throw  new OrderNotFoundException(" Order within interval: " + startTime + " - " + endTime + "NOT FOUND");
        } else {
            return orderList;
        }
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        List<Order> orderList = orderRepository.top10OrdersWithHighestDollarAmountInZip(zip);
        if (orderList == null || orderList.size() == 0) {
            throw  new OrderNotFoundException(" Order in zip: " + zip + "NOT FOUND");
        } else {
            return orderList;
        }
    }

    @Override
    public Order placeOrder(Order order) {
        return orderRepository.placeOrder(order);
    }

    @Override
    public Order cancelOrder(String id) {
        return orderRepository.cancelOrder(id);
    }

    @Override
    public Order updateOrder(String orderId, Order order) {
        return orderRepository.updateOrder(orderId, order);
    }
}
