package com.cxytiandi.sharding.dto;

public class TOrderItemDTO {
    private Long orderItemId;

    private Long orderId;

    private Byte brandCode;

    public Byte getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Byte brandCode) {
        this.brandCode = brandCode;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }
}
