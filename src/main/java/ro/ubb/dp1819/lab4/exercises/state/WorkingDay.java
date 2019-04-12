package ro.ubb.dp1819.lab4.exercises.state;

import ro.ubb.dp1819.lab4.exercises.Employee;

public class WorkingDay implements BillableDay {

    @Override
    public boolean isEmployeeWorking(Employee employee) {
        return true;
    }

    @Override
    public boolean isEmployeeInOffice(Employee employee) {
        return true;
    }

    @Override
    public double getMultiplier() {
        return 1;
    }

}