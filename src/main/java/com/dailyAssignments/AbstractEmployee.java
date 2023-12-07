package com.dailyAssignments;

import java.util.Objects;

public abstract class Employee {
    private long id = 1;
    private String name = "Name";
    private Employee manager = null;

    public Employee(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    /*
     * Calculates the pay for the current period.
     */
    abstract double calculatePay() throws InvalidPayException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}