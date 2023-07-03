package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindAllSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualSales = service.getAllSale(sales);
        int expectedSales = 180;

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualAverageSale = service.getAverageSale(sales);
        int expectedAverageSale = 15;

        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualMonth = service.getMaxMonth(sales);
        int expectedMonth = 8;

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualMonth = service.getMinMonth(sales);
        int expectedMonth = 9;

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualMonthBelowAverage = service.getMonthBelowAverage(sales);
        int expectedMonthBelowAverage = 5;

        Assertions.assertEquals(expectedMonthBelowAverage, actualMonthBelowAverage);
    }

    @Test
    public void shouldFindMonthOverAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actualMonthOverAverage = service.getMonthOverAverage(sales);
        int expectedMonthOverAverage = 5;

        Assertions.assertEquals(expectedMonthOverAverage, actualMonthOverAverage);
    }
}
