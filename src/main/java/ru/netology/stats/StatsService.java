package ru.netology.stats;

public class StatsService {
    public int getAllSale(int[] sales) {
        int allSale = 0;
        for (int sale : sales) {
            allSale += sale;
        }
        return allSale;
    }

    public int getAverageSale(int[] sales) {
        int averageSale = getAllSale(sales) / sales.length;

        return averageSale;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthBelowAverage(int[] sales) {
        int monthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSale(sales)) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    public int getMonthOverAverage(int[] sales) {
        int monthOverAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSale(sales)) {
                monthOverAverage++;
            }
        }
        return monthOverAverage;
    }
}
