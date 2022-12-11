package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> chemists = UsersManager.filterChemistGroupUsernames();

        assertEquals(chemists.size(), 2);
    }

    @Test
    public void testFilterAge() {
        List<User> users = UsersManager.filterUsersByAge(45);

        assertEquals(users.size(), 3);
    }

    @Test
    public void testFilterAgeOrGroup() {
        List<User> users = UsersManager.filterUsersByAgeOrGroup(45, "Sales");

        assertEquals(users.size(), 4);
    }

}
