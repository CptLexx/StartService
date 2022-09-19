public class StartService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale; // sum = sum = sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int countAboveAvg(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}