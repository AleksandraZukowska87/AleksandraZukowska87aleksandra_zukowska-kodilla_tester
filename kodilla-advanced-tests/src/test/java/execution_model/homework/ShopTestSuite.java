package execution_model.homework;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(27.44, new Date(), "Jeff123");
    Order order2 = new Order(429.49, new Date(), "Mark223");
    Order order3 = new Order(1.35, new Date(), "kyle01");
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    Calendar calendar3 = Calendar.getInstance();
    Calendar calendar4 = Calendar.getInstance();
    Calendar calendar5 = Calendar.getInstance();
    Date startDate;
    Date endDate;

    @Test
    public void shouldGetOrdersBetweenDates() {
        calendar1.set(2020, Calendar.JANUARY, 1);
        calendar2.set(2022, Calendar.JANUARY, 1);
        calendar3.set(2021, Calendar.JANUARY, 1);
        order1.orderDate = calendar1.getTime();
        order2.orderDate = calendar2.getTime();
        order3.orderDate = calendar3.getTime();
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);

        Set<Order> result = shop.getOrdersBetweenDates(shop.orders, calendar1.getTime(), calendar2.getTime());

        assertEquals(1, result.size());
        assertTrue(result.contains(order3));
    }

    @Test
    public void shouldGetOrdersBetweenPriceRange() {
        order1.orderValue = 10;
        order2.orderValue = 20;
        order3.orderValue = 30;
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        double minPrice = 10;
        double maxPrice = 20;

        Set<Order> result = shop.getOrdersBetweenPriceRange(shop.orders, minPrice, maxPrice);

        assertEquals(2, result.size());
        assertTrue(result.contains(order1));
        assertTrue(result.contains(order2));
        assertFalse(result.contains(order3));
    }

    @Test
    public void shouldAddNewOrder(){
        assertEquals(0, shop.orders.size());
        shop.addOrder(order1);
        assertEquals(1,shop.orders.size());
    }
    @Test
    public void shouldGetOrderCount(){
        assertEquals(0, shop.orders.size());
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(3, shop.getOrderCount());
    }
    @Test
    public void shouldGetAllOrdersTotalValue(){
        assertEquals(0, shop.getTotalOfAllOrders());
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(458.28, shop.getTotalOfAllOrders(), 0.0001);
    }



    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}
