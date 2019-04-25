package popa.catalin.lab4.strategy;

import popa.catalin.lab4.employees.Employee;

public interface NotificationStrategy {

    void sendMessage(Employee employee, String msg);

}
