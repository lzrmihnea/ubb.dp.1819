package ro.ubb.dp1819.lab4.exercises.strategy;

import ro.ubb.dp1819.lab4.exercises.Employee;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendMessage(Employee employee, String msg) {
        System.out.println("Sending SMS to  employee with message: " +msg);
    }
}
