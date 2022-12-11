package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

        List<User> usersUnder = getUsersUnder40();
        double averageForUnder = getAverage(usersUnder);
        System.out.println("Srednia postow dla uzytkownikow do 40 roku zycia: " + averageForUnder);

        List<User> usersAbove = getUsersAbove40();
        double averageForAbove = getAverage(usersAbove);
        System.out.println("Srednia postow dla uzytkownikow po 40 roku zycia: " + averageForAbove);

    }

    public static List<User> getUsersUnder40() {
        List<User> users = new ArrayList<>();
        for (User u : UsersRepository.getUsersList()) {
            if (u.getAge() < 40) users.add(u);
        }

        return users;
    }

    public static List<User> getUsersAbove40() {
        List<User> users = new ArrayList<>();
        for (User u : UsersRepository.getUsersList()) {
            if (u.getAge() >= 40) users.add(u);
        }

        return users;
    }

    public static double getAverage(List<User> users) {
        return users.stream().mapToInt(n -> n.getNumberOfPost()).average().getAsDouble();
    }

}
