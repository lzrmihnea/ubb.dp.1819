package popa.catalin.lab4.strategy;

import popa.catalin.lab4.employees.Employee;

public enum NotificationType implements NotificationStrategy {
    ShortMessageSystem {
        @Override
        public void sendMessage(Employee employee, String msg) {

        }
    },
    EMail {
        @Override
        public void sendMessage(Employee employee, String msg) {

        }
    },
    PushNotification {
        @Override
        public void sendMessage(Employee employee, String msg) {

        }
    }
}
