import javax.swing.*;

public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 3000, 2018);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500,2021);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        if (notebook.year==2022 && notebook.price <750){
            System.out.println("tani notebook z tego roku");


        }else if ( notebook.year==2022 && notebook.price >=750 && notebook.price <=1000){
            System.out.println("z tego roku w dobrej cenie");

        }else if ( notebook.year==2022 && notebook.price >1000){
            System.out.println("z tego roku jest w drozszej cenie");
        }else {
            System.out.println(" Laptop nie z tego roku wiec ciezko stwierdzic czy cena jest dobra");
        }


    }
}