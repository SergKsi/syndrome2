package ru.netology.javaqa.syndrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.javaqa.syndrome.StatisticsService;

public class StatisticsServiceTest {

    StatisticsService service = new StatisticsService();

    @Test
    public void findMax() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMax2() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 15, 11, 12};
        long expected = 15;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMax3() {

        long[] incomesInBillions = {1, 2, 3, 41, 125, 32, 28, 16, 15, 11, 12};
        long expected = 125;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);

    }

}
