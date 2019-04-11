package ro.ubb.dp1819.lab4.exercises.strategy;

import ro.ubb.dp1819.lab4.exercises.Employee;

public interface NotificationStrategy {

    void sendMessage(Employee employee, String msg);

}
