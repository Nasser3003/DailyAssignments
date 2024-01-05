package com.dailyAssignments;

import java.util.Comparator;

public class Athlete2WinRateComparator implements Comparator<Athlete2> {
    @Override
    public int compare(Athlete2 o1, Athlete2 o2) {
        if (o1.getMatches() == 0 || o2.getMatches() == 0)
            throw new RuntimeException("Cant divinde by zero Athlete2WinRateComparator > compare");

        double ratio1 = o1.getWins();
        double ratio2 = o2.getWins();

        if (o1.getMatches() > 29 && o2.getMatches() > 29) {
            ratio1 = (double) o1.getWins() / o1.getMatches();
            ratio2 = (double) o2.getWins() / o2.getMatches();
        }
        return Double.compare(ratio1, ratio2);
    }
}
