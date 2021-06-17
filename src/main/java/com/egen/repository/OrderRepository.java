package com.egen.repository;

import com.egen.model.Order;

import java.time.ZonedDateTime;
import java.util.List;

public interface OrderRepository {

    List<Order> getAllOrders();

    Order getOrderById(String orderId);

    List<Order> getAllOrdersWithinInterval(ZonedDateTime startTime, ZonedDateTime endTime);

    List<Order> top10OrdersWithHighestDollarAmountInZip(String zip);

    Order placeOrder(Order order);

    Order cancelOrder(String id);

    Order updateOrder(String orderId, Order order);
}
