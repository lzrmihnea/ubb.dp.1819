package ro.ubb.dp1819.lab4.exercises.state;

import ro.ubb.dp1819.lab4.exercises.Employee;

public interface BillableDay {

    boolean isEmployeeWorking(Employee employee);

    boolean isEmployeeInOffice(Employee employee);

    double getMultiplier();
}