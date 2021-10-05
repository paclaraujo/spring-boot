package br.com.impacta.orderservice.orders.repository;

import br.com.impacta.orderservice.orders.dto.OrderDTO;
import br.com.impacta.orderservice.orders.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrdersRepository {
    private List<Order> orders = new ArrayList<Order>();

    public Order findByOrderId(int id) {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        return null;
    }

    public void save(Order order) {
        orders.add(order);
    }

    public void update(int orderId, OrderDTO order) {
        Order orderToUpdate = this.findByOrderId(orderId);
        orderToUpdate.setAddress(order.getAddress());
        orderToUpdate.setDescription(order.getDescription());
        orderToUpdate.setOrderItemsQuantity(order.getOrderItemsQuantity());
        orderToUpdate.setUnitPrice(order.getUnitPrice());
        orderToUpdate.setTotalPrice(order.getTotalPrice());
        orderToUpdate.setPaymentMethod(order.getPaymentMethod());
        orderToUpdate.setTransactionId(order.getTransactionId());
        orderToUpdate.setCardNumber(order.getCardNumber());
        orderToUpdate.setCardExpiringDate(order.getCardExpiringDate());
        orderToUpdate.setCardFlag(order.getCardFlag());
    }

    public void delete(int orderId) {
        Order order = this.findByOrderId(orderId);
        orders.remove(order);
    }

}
