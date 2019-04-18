package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.state.BillableDay;
import ro.ubb.dp1819.lab4.exercises.state.Working;
import ro.ubb.dp1819.lab4.exercises.strategy.EmailNotification;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationType;

public class TL implements Employee {

    public TL(int paycheck, BillableDay billableDay, NotificationType notificationType) {
        this.paycheck = paycheck;
        this.billableDay = billableDay;
        this.notificationType = notificationType;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    private int paycheck;
    private BillableDay billableDay;

    private NotificationType notificationType;

    @Override
    public BillableDay currentBillableDay() {
        return billableDay;
    }

    @Override
    public NotificationType notificationMechanism() {
        return null;
    }
}
