package com.kodilla.execution_model.homework;

import java.util.*;
import java.util.stream.Collectors;
public class Shop {
    public Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }
    public Set<Order> getOrdersBetweenDates(Set<Order> orders, Date startDate, Date endDate) {
        return orders.stream()
                .filter(o -> o.getOrderDate().after(startDate) && o.getOrderDate().before(endDate))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersBetweenPriceRange(Set<Order> orders, double minPrice, double maxPrice) {
        return orders.stream()
                .filter(o -> o.getOrderValue() >= minPrice && o.getOrderValue() <= maxPrice)
                .collect(Collectors.toSet());
    }
    public  int getOrderCount(){
        return orders.size();
    }

    public double getTotalOfAllOrders(){
        double total= 0;
        for (Order order : orders){
            total += order.getOrderValue();
        }
        return total;
    }
}

