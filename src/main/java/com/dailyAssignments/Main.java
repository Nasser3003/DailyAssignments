package com.dailyAssignments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlaylisManager playlisManager = new PlaylisManager();
        playlisManager.addSong("ABC");
        playlisManager.addSong("123");
        playlisManager.addSong("asdada");
        playlisManager.addSong("dadadadada");

        System.out.println("-----------------------------------");
        playlisManager.displayPlaylist();
        System.out.println("-----------------------------------");
        playlisManager.play();
    }
}
