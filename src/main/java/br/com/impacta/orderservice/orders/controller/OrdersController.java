package br.com.impacta.orderservice.orders.controller;

import br.com.impacta.orderservice.orders.dto.OrderDTO;
import br.com.impacta.orderservice.orders.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService service;

    @GetMapping("/findById/{orderId}")
    public ResponseEntity findOrderById(@PathVariable("orderId") String orderId){
        OrderDTO order = service.findOrderById(orderId);
        return new ResponseEntity(order, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<OrderDTO> save(@RequestBody OrderDTO order){
        service.save(order);
        return new ResponseEntity<>("http://localhost:8080/orders/findById/" + (service.getCurrentId() - 1), HttpStatus.ACCEPTED);
    }

    @PostMapping("/update/{orderId}")
    public ResponseEntity<OrderDTO> update(@PathVariable("orderId") String orderId, @RequestBody OrderDTO order){
        service.update(orderId, order);
        return new ResponseEntity<>(order, HttpStatus.ACCEPTED);
    }

    @GetMapping("/delete/{orderId}")
    public ResponseEntity delete(@PathVariable("orderId") String orderId) {
        OrderDTO order = service.delete(orderId);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
