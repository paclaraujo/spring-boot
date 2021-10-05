package br.com.impacta.orderservice.payments.controller;

import br.com.impacta.orderservice.payments.entity.Payment;
import br.com.impacta.orderservice.payments.services.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    private PaymentsService service;

    @GetMapping("/findById/{transactionId}")
    public ResponseEntity findById(@PathVariable("transactionId") int transactionId) {
        Payment payment = service.findByPaymentId(transactionId);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Payment payment) {
        service.save(payment);
        return new ResponseEntity<>("http://localhost:8080/payments/findById/" + payment.getTransactionId(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/update/{transactionId}")
    public ResponseEntity<Payment> update(@PathVariable("transactionId") int transactionId, @RequestBody Payment payment) {
        service.update(transactionId, payment);
        return new ResponseEntity<>(payment, HttpStatus.ACCEPTED);
    }

    @GetMapping("/delete/{transactionId}")
    public ResponseEntity delete(@PathVariable("transactionId") int transactionId) {
        service.delete(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
