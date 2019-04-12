package ro.ubb.dp1819.lab4.exercises.state;

import ro.ubb.dp1819.lab4.exercises.Employee;

public class SickLeave implements BillableDay {

    @Override
    public boolean isEmployeeWorking(Employee employee) {
        return false;
    }

    @Override
    public boolean isEmployeeInOffice(Employee employee) {
        return false;
    }

    @Override
    public double getMultiplier() {
        return 0.8;
    }

}