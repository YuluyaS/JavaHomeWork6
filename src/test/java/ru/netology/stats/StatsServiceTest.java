package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calcSumAllMonthSales() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        StatsService statsService = new StatsService();
        long actualSum = statsService.calcSumAllMonthSales(monthSales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calcAvgMonthSales() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAvgSum = 15;
        StatsService statsService = new StatsService();
        long actualAvgSum = statsService.calcAvgMonthSales(monthSales);
        Assertions.assertEquals(expectedAvgSum, actualAvgSum);
    }

    @Test
    public void calcMonthOfMaxSales() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthOfMaxSales = 8;
        StatsService statsService = new StatsService();
        int actualMonthOfMaxSales = statsService.calcMonthOfMaxSales(monthSales);
        Assertions.assertEquals(expectedMonthOfMaxSales, actualMonthOfMaxSales);
    }

    @Test
    public void calcMonthOfMinSales() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthOfMinSales = 9;
        StatsService statsService = new StatsService();
        int actualMonthOfMinSales = statsService.calcMonthOfMinSales(monthSales);
        Assertions.assertEquals(expectedMonthOfMinSales, actualMonthOfMinSales);
    }

    @Test
    public void calcMonthesOfUnderAvg() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthesOfUnderAvg = 5;
        StatsService statsService = new StatsService();
        int actualMonthesOfUnderAvg = statsService.calcMonthesOfUnderAvg(monthSales);
        Assertions.assertEquals(expectedMonthesOfUnderAvg, actualMonthesOfUnderAvg);
    }

    @Test
    public void calcMonthesOfOverAvg() {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthesOfOverAvg = 5;
        StatsService statsService = new StatsService();
        int actualMonthesOfOverAvg = statsService.calcMonthesOfOverAvg(monthSales);
        Assertions.assertEquals(expectedMonthesOfOverAvg, actualMonthesOfOverAvg);
    }
}