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

        Grades grades = new Grades();
        grades.add(5);
        grades.add(6);
        grades.add(3);


        System.out.println(grades.getAverage());
        System.out.println(grades.getLast());

        User[] users = {new User("marek",26,180),
                        new User("tomek",48,180),
                        new User("bartek",21,180),
                        new User("kuba",22,180),
                        new User("michal",23,180)};

        int ageTotal = 0;
        int ageAverage;

        for (int i = 0; i< users.length;i++){
            ageTotal += users[i].age;
        }
        ageAverage = ageTotal / users.length;

        System.out.println(ageAverage);

        for (int i = 0; i < users.length; i++){
            if (users[i].age < ageAverage){
                System.out.println(users[i].name);
            }
        }


        RandomNumbers random = new RandomNumbers();
        random.generateRandom();
        System.out.println(random.getTotal());
        System.out.println(random.getSmallest());
        System.out.println(random.getBiggest());



    }
}