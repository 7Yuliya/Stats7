package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTotalBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotal = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualTotal = service.getTotalOfAllSales(sales);
        Assertions.assertEquals(expectedTotal, actualTotal);
    }


    @Test
    public void shouldFindAverageAmountBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        long actualAverage = service.getAverageSalesAmountMonth(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }


    @Test
    public void shouldFindMaxBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinAverageBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinAverage = 5;
        int actualMinAverage = service.getMinAverageMonth(sales);
        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test

    public void shouldFindMaxAverageBetweenEnds() {

        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxAverage = 5;
        int actualMaxAverage = service.getMaxAverageMonth(sales);
        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }
}