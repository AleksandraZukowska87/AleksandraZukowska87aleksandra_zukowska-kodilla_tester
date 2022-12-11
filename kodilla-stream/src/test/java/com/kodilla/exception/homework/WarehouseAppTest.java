package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTest {

    @Test
    void getOrderTestException() {
        Warehouse warehouse = WarehouseApp.getWarehouse();

        assertThrows(OrderDoesntExistException.class,()->warehouse.getOrderNumber("444DD"));
    }
}
