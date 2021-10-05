package br.com.impacta.orderservice.orders.controller;

import br.com.impacta.orderservice.orders.dto.OrderDTO;
import br.com.impacta.orderservice.orders.exceptions.EntityNotFoundException;
import br.com.impacta.orderservice.orders.exceptions.InvalidRegistryException;
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
    public ResponseEntity findOrderById(@PathVariable("orderId") int orderId) throws EntityNotFoundException {
        OrderDTO order = service.findOrderById(orderId);
        return new ResponseEntity(order, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<OrderDTO> save(@RequestBody OrderDTO order){
        int orderId = service.save(order);
        return new ResponseEntity("http://localhost:8080/orders/findById/" +  orderId, HttpStatus.CREATED);
    }

    @PostMapping("/update/{orderId}")
    public ResponseEntity<OrderDTO> update(@PathVariable("orderId") int orderId, @RequestBody OrderDTO order) throws EntityNotFoundException, InvalidRegistryException {
        service.update(orderId, order);
        return new ResponseEntity(order, HttpStatus.ACCEPTED);
    }

    @GetMapping("/delete/{orderId}")
    public ResponseEntity delete(@PathVariable("orderId") int orderId) {
        service.delete(orderId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
