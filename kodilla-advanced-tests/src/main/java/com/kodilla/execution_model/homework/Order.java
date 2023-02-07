package com.kodilla.execution_model.homework;

import java.util.Calendar;
import java.util.Date;

public class Order {

    public double orderValue;
    public Date orderDate;
    public String orderUserLogin;

    public Order(double orderValue, Date orderDate, String orderUserLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.orderUserLogin = orderUserLogin;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getOrderValue() {
        return orderValue;
    }
}
