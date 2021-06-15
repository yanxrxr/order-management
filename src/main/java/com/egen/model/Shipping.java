package com.egen.model;

public class Shipping {
    private String id;
    // In-store pickup, curbside pickup, ship to home, 3rd party delivery
    private String shippingMethod;
    private float shippingCharges;
    private Address shippingAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public float getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(float shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
