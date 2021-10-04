package br.com.impacta.orderservice.orders.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDTO {
    private String email;
    private String fullName;
    private String address;
    private String orderId;
    private List<String> description;
    private int orderItemsQuantity;
    private List<BigDecimal> unitPrice;
    private BigDecimal totalPrice;
    private String paymentMethod;
    private String orderDate;
    private String status;
    private int transactionId;
    private String cardNumber;
    private String cardExpiringDate;
    private String cardFlag;

    public OrderDTO(String email, String fullName, String address, String orderId, List<String> description,
                    int orderItemsQuantity, List<BigDecimal> unitPrice, BigDecimal totalPrice, String paymentMethod,
                    String orderDate, String status, int transactionId, String cardNumber, String cardExpiringDate,
                    String cardFlag) {
        this.email = email;
        this.fullName = fullName;
        this.address = address;
        this.orderId = orderId;
        this.description = description;
        this.orderItemsQuantity = orderItemsQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.orderDate = orderDate;
        this.status = status;
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.cardExpiringDate = cardExpiringDate;
        this.cardFlag = cardFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public int getOrderItemsQuantity() {
        return orderItemsQuantity;
    }

    public void setOrderItemsQuantity(int orderItemsQuantity) {
        this.orderItemsQuantity = orderItemsQuantity;
    }

    public List<BigDecimal> getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(List<BigDecimal> unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
