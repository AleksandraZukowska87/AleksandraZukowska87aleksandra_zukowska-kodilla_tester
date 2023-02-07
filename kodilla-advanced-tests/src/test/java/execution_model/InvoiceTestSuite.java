package execution_model;

import com.kodilla.execution_model.Invoice;
import com.kodilla.execution_model.Item;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    public Invoice invoice = new Invoice();

    public Item energyDrink = new Item("Energy Drink",1.35);
    public Item crisps = new Item("Crisps", 2.99);
    public Item binBag = new Item("Bin Bag", 4.15);

    public  Item [] items = {energyDrink,crisps,binBag};
    @Test
    public void shouldAddItemsToInvoice(){
        int count = invoice.getSize();
        assertEquals(3, count);
    }

    @Test
    public void shouldGetSpecificItemFromInvoice(){
        Item item = invoice.getItem(0);
        assertEquals("Energy Drink", item.getName());
        assertEquals(1.35,item.getPrice());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,-5,3,4,5,12,41})
    public void shouldReturnNullWhenPassingInvalidIndex(int number){
        assertNull(invoice.getItem(number));
    }

    @Test
    public void shouldClearInvoice(){
        assertEquals(3,invoice.getSize());
        invoice.clear();
        assertEquals(0,invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(energyDrink);
        invoice.addItem(crisps);
        invoice.addItem(binBag);
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
