package csorba.norberth.lab4.state;


import csorba.norberth.lab4.employees.Employee;

public interface BillableDay {

    boolean isEmployeeWorking(Employee employee);

    boolean isEmployeeInOffice(Employee employee);

    double paycheckCoeff();

}
