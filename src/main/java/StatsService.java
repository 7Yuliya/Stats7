
public class StatsService {
    public long getTotalOfAllSales(long[] sales) {
        long totalOfAllSale = 0;
        for (long sale : sales) {

            totalOfAllSale += sale;

        }
        return totalOfAllSale;
    }


    public long getAverageSalesAmountMonth(long[] sales) {

        return getTotalOfAllSales(sales) / 12;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getMinAverageMonth(long[] sales) {
        long average = getAverageSalesAmountMonth(sales);
        int minAverageMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                minAverageMonth++;

            }
        }
        return minAverageMonth;
    }

    public int getMaxAverageMonth(long[] sales) {
        long average = getAverageSalesAmountMonth(sales);
        int maxAverageMonth = 0;
        for (long sale : sales) {
            if (sale > average) {

                maxAverageMonth++;
            }
        }
        return maxAverageMonth;
    }

}
