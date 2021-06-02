package com.company.work1;

import java.util.Objects;

public class Device {

    private String serialNumber;
    private String manufacturer;
    private double price;

    public Device() {
    }

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

      return ("class="+ this.getClass().getSimpleName() + " serialNumber=" + serialNumber +
                " manufacturer=" + manufacturer + " price=" + price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Double.compare(device.price, price) == 0 &&
                serialNumber.equals(device.serialNumber) &&
                manufacturer.equals(device.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, manufacturer, price);
    }
}
