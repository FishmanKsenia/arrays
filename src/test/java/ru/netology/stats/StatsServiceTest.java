package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.getAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;
        long actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
