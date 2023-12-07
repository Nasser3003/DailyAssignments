package com.dailyAssignments;

public class SalaryAbstractEmployee extends AbstractEmployee {
    private double salary; // annual salary

    public SalaryAbstractEmployee(String name, AbstractEmployee manager, double salary) throws InvalidSalaryException {
        super(name, manager);
        this.setSalary(salary);
    }

    @Override
    public double calculatePay() {
        return salary / 12;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 2080 * 7.25) throw new InvalidSalaryException("Exception in SalaryEmployee CLASS setSalary method");
        this.salary = salary;
    }


}