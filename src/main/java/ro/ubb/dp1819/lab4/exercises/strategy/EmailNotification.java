package ro.ubb.dp1819.lab4.exercises.strategy;

import ro.ubb.dp1819.lab4.exercises.Employee;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void sendMessage(Employee employee, String msg) {
        System.out.println("Sending e-mail to employee " + employee + ": " + msg);
    }

}
