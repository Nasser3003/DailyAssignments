package com.dailyAssignments;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Athlete implements Comparable<Athlete> {
    private String name;
    private int wins;
    private int matches;

    @Override
    public int compareTo(Athlete o) {
        if (getMatches() == 0 || o.getMatches() == 0)
            throw new RuntimeException("Cant divinde by zero Athlete2WinRateComparator > compare");
        double ratio1 = getWins();
        double ratio2 = o.getWins();

        if (getMatches() > 29 && o.getMatches() > 29) {
            ratio1 = (double) getWins() / getMatches();
            ratio2 = (double) o.getWins() / o.getMatches();
        }
        return Double.compare(ratio1, ratio2);
    }
}