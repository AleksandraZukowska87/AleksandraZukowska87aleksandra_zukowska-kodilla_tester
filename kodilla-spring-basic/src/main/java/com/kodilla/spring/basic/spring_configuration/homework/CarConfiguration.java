package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarConfiguration {


    @Bean
    public Car car() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Season season = getByDate(localDateTime);
        if (season == Season.WINTER) {
            return new SUV();
        } else if (season == Season.SUMMER) {
            return new Cabrio();

        }
        return new Sedan();

    }

    private enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;
    }

    private Season getByDate(LocalDateTime localDateTime) {
        int v = (localDateTime.getMonthValue() / 4);
        return Season.values()[v];
    }
}
