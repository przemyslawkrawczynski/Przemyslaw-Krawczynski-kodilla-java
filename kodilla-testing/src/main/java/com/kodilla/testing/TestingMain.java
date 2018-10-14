package com.kodilla.testing;

import com.kodilla.testing.forum.statistics.CountStatistics;
import com.kodilla.testing.forum.statistics.StatisticStub;
import com.kodilla.testing.forum.statistics.Statistics;

public class TestingMain {
    public static void main(String[] args){

        Statistics firstStat = new StatisticStub();
        CountStatistics countFirstStatistic = new CountStatistics();

        countFirstStatistic.calculateAdvStatistics(firstStat);
        countFirstStatistic.showStatistics();
    }
}



