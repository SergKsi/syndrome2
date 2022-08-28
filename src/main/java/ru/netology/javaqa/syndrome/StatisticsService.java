package ru.netology.javaqa.syndrome;

public class StatisticsService {

    public long findMax(long[] incomes) {
        long current_index_max = 0;
        long current_max = incomes[0];
        for (long income : incomes) {
            if (current_max < income) {
                current_max = income;
            }
        }
        return current_max;
    }
}
