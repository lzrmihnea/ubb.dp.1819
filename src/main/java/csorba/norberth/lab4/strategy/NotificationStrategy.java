package csorba.norberth.lab4.strategy;

import csorba.norberth.lab4.employees.Employee;

public interface NotificationStrategy {

    void sendMessage(Employee employee, String msg);

}
