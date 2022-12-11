package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
       Warehouse warehouse = getWarehouse();

        try {
            Order findOrder = warehouse.getOrderNumber("54DGD");
            System.out.println("Order found!");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesnt exist!");
        } finally {
            System.out.println("Hope result is fine!");
        }

        try {
            Order findOrder = warehouse.getOrderNumber("363NN");
            System.out.println("Order found!");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesnt exist!");
        } finally {
            System.out.println("Hope result is fine!");
        }
    }

    public static Warehouse getWarehouse(){
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("A863D"));
        warehouse.addOrder(new Order("G123D"));
        warehouse.addOrder(new Order("363NN"));
        warehouse.addOrder(new Order("P136I"));
        warehouse.addOrder(new Order("T353U"));
        return warehouse;
    }
}
