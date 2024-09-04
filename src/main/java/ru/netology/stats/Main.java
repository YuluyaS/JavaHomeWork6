package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService statsService = new StatsService();

        long expectedSum = statsService.calcSumAllMonthSales(monthSales); //
        System.out.println("Сумма всех продаж=" + expectedSum);

        long expectedAvgSum = statsService.calcAvgMonthSales(monthSales);
        System.out.println("Cредняя сумма продаж в месяц=" + expectedAvgSum);

        int expectedMonthOfMaxSales = statsService.calcMonthOfMaxSales(monthSales);
        System.out.println("Номер месяца с последними максимальными продажами=" + expectedMonthOfMaxSales);

        int expectedMonthOfMinSales = statsService.calcMonthOfMinSales(monthSales);
        System.out.println("Номер месяца с последними минимальными продажами=" + expectedMonthOfMinSales);

        int expectedMonthesOfUnderAvg = statsService.calcMonthesOfUnderAvg(monthSales);
        System.out.println("Количество месяцев с продажами ниже среднего=" + expectedMonthesOfUnderAvg);

        int expectedMonthesOfOverAvg = statsService.calcMonthesOfOverAvg(monthSales);
        System.out.println("Количество месяцев с продажами выше среднего=" + expectedMonthesOfOverAvg);
    }
}