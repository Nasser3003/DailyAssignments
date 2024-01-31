package com.dailyAssignments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Runner implements Runnable {
    public static volatile String winner;

    private String name;
    private double distance;
    private double speedPerSecond;
    @Override
    public void run() {
        double travelled = 0;
        while (travelled < distance) {
            if (winner != null)
                break;
            try {
                Thread.sleep(100);
                travelled += speedPerSecond;
                System.out.println(name + " Travelled: " + travelled);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (winner == null)
            winner = name;
    }
}
