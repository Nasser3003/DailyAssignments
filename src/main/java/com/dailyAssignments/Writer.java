package com.dailyAssignments;

import lombok.AllArgsConstructor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@AllArgsConstructor
public class Writer {
    public void writeIntoFile(String pathToWrite, List<String> strings) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToWrite))) {
            for (String s : strings)
                writer.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
