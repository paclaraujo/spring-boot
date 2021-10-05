# Palindrome

API para listagem, criação, atualização e deleção de pedidos.

## Pré Requisitos 

- [Java](https://www.java.com/pt-BR/)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

## Instalação

Clone o projeto em sua máquina:
```sh
git clone https://github.com/paclaraujo/spring-boot
```

## Orders

### /orders/findById/{orderId}

Lista o pedido com base no seu id

#### Parâmetros

```orderId int```

#### Response

Status: OK

```json
{
    "orderId" : 1, 
    "email" : "john.doe@gmail.com", 
    "fullName" : "John Doe", 
    "address" : "Rua Teste, 123", 
    "description" : ["desc A","desc B"],
    "orderItemsQuantity" : 1, 
    "unitPrice" : [10.00, 10.00], 
    "totalPrice" : 20.00, 
    "paymentMethod" : "credit card", 
    "orderDate" : "28/09/2021",
    "status" : "prepared", 
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

### /orders/save

Salva novos pedidos

#### Request body

```json
{
    "orderId" : 1, 
    "email" : "john.doe@gmail.com", 
    "fullName" : "John Doe", 
    "address" : "Rua Teste, 123", 
    "description" : ["desc A","desc B"],
    "orderItemsQuantity" : 1, 
    "unitPrice" : [10.00, 10.00], 
    "totalPrice" : 20.00, 
    "paymentMethod" : "credit card", 
    "orderDate" : "28/09/2021",
    "status" : "prepared", 
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

#### Response

Status: CREATED

```http://localhost:8080/orders/findById/{orderId}```


### /orders/update/{orderId}

Atualiza pedidos já existentes

#### Parâmetros

```orderId int```

#### Request body

```json
{
    "orderId" : 1, 
    "email" : "john.doe@gmail.com", 
    "fullName" : "John Doe", 
    "address" : "Rua Teste, 123", 
    "description" : ["desc A","desc B"],
    "orderItemsQuantity" : 1, 
    "unitPrice" : [10.00, 10.00], 
    "totalPrice" : 20.00, 
    "paymentMethod" : "credit card", 
    "orderDate" : "28/09/2021",
    "status" : "prepared", 
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

#### Response

Status: ACCEPTED

```json
{
    "orderId" : 1, 
    "email" : "john.doe@gmail.com", 
    "fullName" : "John Doe", 
    "address" : "Rua Teste, 123", 
    "description" : ["desc A","desc B"],
    "orderItemsQuantity" : 1, 
    "unitPrice" : [10.00, 10.00], 
    "totalPrice" : 20.00, 
    "paymentMethod" : "credit card", 
    "orderDate" : "28/09/2021",
    "status" : "prepared", 
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

### /orders/delete/{orderId}

Deleta pedido

#### Parâmetros

```orderId int```

#### Response 

Status: OK

## Payments

### /payments/findById/{paymentId}

Lista o pagamento com base no seu id

#### Parâmetros

```paymentId int```

#### Response

Status: OK

```json
{
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

### /payments/save

Salva novos pagamentos

#### Request body

```json
{
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "cardFlag" : "Visa"
}
```

#### Response

Status: CREATED

```http://localhost:8080/payments/findById/{paymentId}```


### /payments/update/{paymentId}

Atualiza pagamentos já existentes

#### Parâmetros

```paymentId int```

#### Request body

```json
{
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "bandeicardFlagra" : "Visa"
}
```

#### Response 

Status: ACCEPTED

```json
{
    "transactionId" : 2, 
    "cardNumber" : "123412341234", 
    "cardExpiringDate" : "08/2026", 
    "bandeicardFlagra" : "Visa"
}
```

### /payments/delete/{paymentId}

Deleta pagamento

#### Parâmetros

```paymentId int```

#### Response 

Status: OK

## Tecnologias usadas

- [Java](https://www.java.com/pt-BR/)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

## Autora

* **Paloma Araujo** - [@paclaraujo](https://github.com/paclaraujo)
