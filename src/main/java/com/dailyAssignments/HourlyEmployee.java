package com.dailyAssignments;

public class HourlyAbstractEmployee extends AbstractEmployee {
    public HourlyAbstractEmployee(String name, AbstractEmployee manager, double hoursWorked, double wage) throws InvalidWageException {
        super(name, manager);
        this.hoursWorked = hoursWorked;
        this.setWage(wage);
    }

    private double hoursWorked;
    private double wage; // per hour

    @Override
    public double calculatePay() {
        return wage * hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) throws InvalidWageException {
        if (wage < 7.25) throw new InvalidWageException("Exception in HourlyEmployee CLASS setWage method");
        this.wage = wage;
    }

}