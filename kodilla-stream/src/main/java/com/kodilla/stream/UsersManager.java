package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList().stream().filter(user -> user.getGroup().equals("Chemists")).map(UsersManager::getUserName).forEach(username -> System.out.println(username));
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList().stream().filter(user -> user.getGroup().equals("Chemists")).map(UsersManager::getUserName).collect(Collectors.toList());
        return usernames;
    }

    public static List<User> filterUsersByAge(int age) {
        List<User> users = UsersRepository.getUsersList().stream().filter(user -> user.getAge() > age).collect(Collectors.toList());
        return users;
    }

    public static List<User> filterUsersByAgeOrGroup(int age, String group) {
        List<User> users = UsersRepository.getUsersList().stream().filter(user -> user.getAge() > age || user.getGroup().equals(group)).collect(Collectors.toList());

        return users;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
