package ru.netology.stats;

public class StatsService {

    public int calcSumAllMonthSales(int[] monthSales) {
        int sum = 0;
        for (int i = 0; i < monthSales.length; i++) {
            sum += monthSales[i];
        }
        return sum;
    }

    public int calcAvgMonthSales(int[] monthSales) {
        int avgSum = 0;
        for (int i = 0; i < monthSales.length; i++) {
            avgSum += monthSales[i];
        }
        avgSum = avgSum / monthSales.length;
        return avgSum;
    }

    public int calcMonthOfMaxSales(int[] monthSales) {
        int monthOfMaxSales = 0;


        for (int i = 0; i < monthSales.length; i++) {


            if (monthSales[i] >= monthSales[monthOfMaxSales]) {
                monthOfMaxSales = i;

            }
        }
        return monthOfMaxSales + 1;
    }

    public int calcMonthOfMinSales(int[] monthSales) {
        int monthOfMinSales = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] <= monthSales[monthOfMinSales]) {
                monthOfMinSales = i;
            }
        }
        return monthOfMinSales + 1;
    }

    public int calcMonthesOfUnderAvg(int avgSum, int[] monthSales) {

        int monthesOfUnderAvg = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] < avgSum) { //
                monthesOfUnderAvg++; //
            }
        }
        return monthesOfUnderAvg;
    }

    public int calcMonthesOfOverAvg(int avgSum, int[] monthSales) {

        int monthesOfOverAvg = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] > avgSum) { //
                monthesOfOverAvg++; //
            }
        }
        return monthesOfOverAvg;
    }

}