package com.praneetha.springecom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    private int quantity;

    private BigDecimal totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    public Product getProduct() {
    return product;
}

public int getQuantity() {
    return quantity;
}

public BigDecimal getTotalPrice() {
    return totalPrice;
}

public void setProduct(Product product) {
    this.product = product;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
}

public void setOrder(Order order) {
    this.order = order;
}
}
