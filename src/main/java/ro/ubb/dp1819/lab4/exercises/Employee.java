package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.state.BillableDay;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationType;

public interface Employee {

    BillableDay currentBillableDay();

    NotificationType notificationMechanism();

}
