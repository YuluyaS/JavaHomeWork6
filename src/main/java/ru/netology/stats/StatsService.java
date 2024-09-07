package ru.netology.stats;

public class StatsService {

    public long calcSumAllMonthSales(long[] monthSales) {
        long sum = 0;
        for (int i = 0; i < monthSales.length; i++) {
            sum += monthSales[i];
        }
        return sum;
    }

    public long calcAvgMonthSales(long[] monthSales) {
        long avgSum = 0;
        for (int i = 0; i < monthSales.length; i++) {
            avgSum += monthSales[i];
        }
        avgSum = avgSum / monthSales.length;
        return avgSum;
    }

    public int calcMonthOfMaxSales(long[] monthSales) {
        int monthOfMaxSales = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[monthOfMaxSales]) {
                monthOfMaxSales = i;
            }
        }
        return monthOfMaxSales + 1;
    }

    public int calcMonthOfMinSales(long[] monthSales) {
        int monthOfMinSales = 0;

        for (int i = 0; i < monthSales.length; i++) {

            if (monthSales[i] <= monthSales[monthOfMinSales]) {
                monthOfMinSales = i;

            }
        }
        return monthOfMinSales + 1;
    }


    public int calcMonthesOfUnderAvg(long[] monthSales) {

        long avgSum = calcAvgMonthSales(monthSales);
        int monthesOfUnderAvg = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] < avgSum) { //
                monthesOfUnderAvg++; //
            }
        }
        return monthesOfUnderAvg;
    }

    public int calcMonthesOfOverAvg(long[] monthSales) {

        long avgSum = calcAvgMonthSales(monthSales);
        int monthesOfOverAvg = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] > avgSum) { //
                monthesOfOverAvg++; //
            }
        }
        return monthesOfOverAvg;
    }

}