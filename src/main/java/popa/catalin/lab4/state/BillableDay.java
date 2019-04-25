package popa.catalin.lab4.state;


import popa.catalin.lab4.employees.Employee;

public interface BillableDay {
    double percentagePaid(Employee employee);

    boolean isEmployeeWorking(Employee employee);

    boolean isEmployeeInOffice(Employee employee);

}
