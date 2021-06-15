package com.egen.model;

import java.util.UUID;

public class Shipping {
    private String id;
    private ShippingMethod shippingMethod;
    private double shippingCharges;
    private Address shippingAddress;

    public Shipping() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public double getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(double shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "id='" + id + '\'' +
                ", shippingMethod=" + shippingMethod +
                ", shippingCharges=" + shippingCharges +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
