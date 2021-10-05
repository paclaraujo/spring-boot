package br.com.impacta.orderservice.payments.repository;

import br.com.impacta.orderservice.payments.entity.Payment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentsRepository {
    private List<Payment> payments = new ArrayList<Payment>();

    public Payment findByPaymentId(int id) {
        for (Payment payment : payments) {
            if (payment.getTransactionId() == id) {
                return payment;
            }
        }
        return null;
    }

    public void save(Payment payment) {
        this.payments.add(payment);
    }

    public void update(int transactionId, Payment payment) {
        Payment newPayment = this.findByPaymentId(transactionId);
        newPayment.setTransactionId(payment.getTransactionId());
        newPayment.setCardNumber(payment.getCardNumber());
        newPayment.setCardFlag(payment.getCardFlag());
        newPayment.setCardExpiringDate(payment.getCardExpiringDate());
    }

    public void delete(int transactionId) {
        Payment payment = this.findByPaymentId(transactionId);
        payments.remove(payment);
    }
}
