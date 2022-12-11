package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    void getUsersUnder40() {
        List<User> under = ForumStats.getUsersUnder40();
        assertEquals(2, under.size());
    }

    @Test
    void getUsersAbove40() {
        List<User> above = ForumStats.getUsersAbove40();
        assertEquals(4, above.size());
    }

    @Test
    void getAverage() {
        List<User> above = ForumStats.getUsersAbove40();
        double average = ForumStats.getAverage(above);
        assertEquals(2.25D, average);
    }
}
