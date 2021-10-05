package br.com.impacta.orderservice.orders.services;

import br.com.impacta.orderservice.orders.dto.OrderDTO;
import br.com.impacta.orderservice.orders.entity.Order;
import br.com.impacta.orderservice.orders.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersService {
    private OrdersRepository repository;
    private int currentId;

    @Autowired
    public OrdersService(OrdersRepository repository) {
        this.repository = repository;
        this.currentId = 0;
    }

    public OrderDTO findOrderById(int orderId){
        Order order = repository.findByOrderId(orderId);

        OrderDTO orderDTO = new OrderDTO(order.getEmail(), order.getFullName(), order.getAddress(),
                order.getOrderId(), order.getDescription(), order.getOrderItemsQuantity(), order.getUnitPrice(),
                order.getTotalPrice(), order.getPaymentMethod(), order.getOrderDate(), order.getStatus(),
                order.getTransactionId(), order.getCardNumber(), order.getCardExpiringDate(), order.getCardFlag());
        return orderDTO;
    }

    public int save(OrderDTO order){
        Order savedOrder = new Order(this.currentId, order.getEmail(), order.getFullName(), order.getAddress(),
                order.getDescription(), order.getOrderItemsQuantity(), order.getUnitPrice(),
                order.getTotalPrice(), order.getPaymentMethod(), order.getOrderDate(), order.getStatus(),
                order.getTransactionId(), order.getCardNumber(), order.getCardExpiringDate(), order.getCardFlag());
        this.repository.save(savedOrder);

        currentId++;
        return order.getOrderId();
    }

    public void update(int orderId, OrderDTO order){
        repository.update(orderId, order);
    }

    public void delete(int orderId){
        repository.delete(orderId);
    }
}
