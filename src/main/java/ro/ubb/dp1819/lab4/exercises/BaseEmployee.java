package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.state.BillableDay;
import ro.ubb.dp1819.lab4.exercises.state.WorkingDay;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationType;

public class BaseEmployee implements Employee {

    private double paycheck;
    private BillableDay currentBillableDay; // state attribute
    private NotificationType notificationType;

    protected BaseEmployee(final double paycheck) {
        this.paycheck = paycheck;

        // set defaults
        currentBillableDay = new WorkingDay();
        notificationType = NotificationType.EMAIL;
    }

    public void setCurrentBillableDay(final BillableDay billableDay) {
        this.currentBillableDay = billableDay;
    }

    public void setNotificationType(final NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public BillableDay currentBillableDay() {
        return currentBillableDay;
    }

    @Override
    public double getBillableDayPaycheck() {
        return (double) Math.round(paycheck * currentBillableDay.getMultiplier() * 100) / 100;
    }

    @Override
    public NotificationType notificationMechanism() {
        return notificationType;
    }

}
