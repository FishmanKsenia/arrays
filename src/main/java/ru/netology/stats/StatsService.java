package ru.netology.stats;

public class StatsService {

    public long getAllSales(long[] sales) {
        long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        return allSales;
    }

    public long getAverageSales(long[] sales) {
        long averageSales = getAllSales(sales) / sales.length;
        return averageSales;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
        long average = getAverageSales(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                months++;
            }
        }
        return months;
    }

    public int getMonthsAboveAverage(long[] sales) {
        long average = getAverageSales(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months++;
            }
        }
        return months;
    }
}
