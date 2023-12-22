package com.dailyAssignments;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PlaylisManager {
    private List<String> list = new LinkedList<>();
    private ListIterator<String> playlistIterator = list.listIterator();

    public void addSong(String song) {
        list.add(song);
        System.out.println("Song added successfully");
    }
    public void play() {
         if (playlistIterator.hasNext()) {
             playlistIterator = list.listIterator();
             while (playlistIterator.hasNext()) {
                 String song = playlistIterator.next();
                 System.out.println("Playing " + song);
             }
        } else {
             System.out.println("Playlist Empty");
         }
    }
    public void displayPlaylist() {
        ListIterator<String> displayIterator = list.listIterator();

        if (displayIterator.hasNext()) {
            while (displayIterator.hasNext()) {
                System.out.println("playlist Song Name: " + displayIterator.next());
            }
        }
    }
}
