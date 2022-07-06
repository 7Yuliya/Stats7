
public class StatsService {
    public int getTotalOfAllSales(int[] sales) {
        int totalOfAllSale = 0;
        for (int i = 0; i < sales.length; i++) {

            totalOfAllSale = totalOfAllSale + sales[i];
            if (sales[i] > totalOfAllSale)
                totalOfAllSale = i;
        }
        return totalOfAllSale;
    }


    public int getAverageSalesAmountMonth(int[] sales) {
        int sum = 0;
        int averageSalesAmountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageSalesAmountMonth = sum / sales.length;
            if (sales[i] < averageSalesAmountMonth)
                averageSalesAmountMonth = i;

        }
        return averageSalesAmountMonth;
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

    public int getMinAverageMonth(int[] sales) {
        int sum = 0;
        int averageSalesAmountMonth = 0;
        int minAverageMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        averageSalesAmountMonth = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSalesAmountMonth){

                minAverageMonth++;
            }
        }
        return minAverageMonth;
    }

    public int getMaxAverageMonth(int[] sales) {
        int sum = 0;
        int averageSalesAmountMonth = 0;
        int maxAverageMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        averageSalesAmountMonth = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSalesAmountMonth){

                maxAverageMonth++;
            }
        }
        return maxAverageMonth;
    }
}