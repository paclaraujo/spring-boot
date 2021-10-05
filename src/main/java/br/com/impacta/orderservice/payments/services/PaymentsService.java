package br.com.impacta.orderservice.payments.services;

import br.com.impacta.orderservice.payments.entity.Payment;
import br.com.impacta.orderservice.payments.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentsService {
    private PaymentsRepository repository;

    @Autowired
    public PaymentsService(PaymentsRepository repository) {
        this.repository = repository;
    }

    public Payment findByPaymentId(int id) {
        Payment payment = repository.findByPaymentId(id);
        return payment;
    }

    public void save(Payment payment) {
        this.repository.save(payment);
    }

    public void update(int transactionId, Payment payment) {
        repository.update(transactionId, payment);
    }

    public void delete(int transactionId) {
        repository.delete(transactionId);
    }
}
