public class SimpleArray {
    public static void main(String[] args) {
        String[] books  = new String[5];
        books[0] = "Harry Potter";
        books[1] = "Wiedzmin";
        books[2] = "Pinocio";
        books[3] = "Esmeralda";
        books[4] = "Ania z Zielonego Wzgorza";


        String book = books[3];

        System.out.println(book);

       int numberOfElements = books.length;

       System.out.println("Moja tablica zawiera " +  numberOfElements + " elementow");





    }
}
