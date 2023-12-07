package com.dailyAssignments;

public class InvalidSizeException extends IllegalArgumentException {
    public InvalidSizeException(String msg) {
        super(msg);
    }

    public InvalidSizeException() {
    }
}
