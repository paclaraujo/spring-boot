package br.com.impacta.orderservice.payments.entity;

import br.com.impacta.orderservice.orders.dto.OrderDTO;

import java.math.BigDecimal;
import java.util.List;

public class Payment {
    private int transactionId;
    private String cardNumber;
    private String cardExpiringDate;
    private String cardFlag;

    public Payment(int transactionId, String cardNumber, String cardExpiringDate,
                   String cardFlag) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.cardExpiringDate = cardExpiringDate;
        this.cardFlag = cardFlag;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpiringDate() {
        return cardExpiringDate;
    }

    public void setCardExpiringDate(String cardExpiringDate) {
        this.cardExpiringDate = cardExpiringDate;
    }

    public String getCardFlag() {
        return cardFlag;
    }

    public void setCardFlag(String cardFlag) {
        this.cardFlag = cardFlag;
    }
}
