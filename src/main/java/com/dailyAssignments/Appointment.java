package com.dailyAssignments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private ZonedDateTime start;
    private Duration durationInMinutes;

    public void alert() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM d 'at' h:mm a", Locale.US);
        String time = start.format(formatter);

        long hours = durationInMinutes.toHours();
        long minutes = durationInMinutes.toMinutes() % 60;

        String formattedDuration;
        if (hours > 0)
            formattedDuration = String.format("%d hours and %d minutes", hours, minutes);
        else
            formattedDuration = String.format("%d minutes", minutes);
        System.out.println("You have a " + formattedDuration + " appointment on " + time);
    }
}
