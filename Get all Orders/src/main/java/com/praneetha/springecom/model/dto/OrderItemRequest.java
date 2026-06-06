package com.praneetha.springecom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
