package ro.ubb.dp1819.lab4.exercises.chain_of_responsibility;

import ro.ubb.dp1819.lab4.exercises.BaseEmployee;
import ro.ubb.dp1819.lab4.exercises.Employee;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationStrategy;

public class BaseHolidayApprover extends BaseEmployee implements HolidayApprover {

    private BaseHolidayApprover nextHolidayApprover; // next in chain
    private NotificationStrategy notificationStrategy;

    public BaseHolidayApprover(final double paycheck) {
        super(paycheck);
    }

    public void setNextHolidayApprover(final BaseHolidayApprover next) {
        this.nextHolidayApprover = next;
    }

    public void setNotificationStrategy(final NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyEmployee(final Employee employee, final String message) {
        notificationStrategy.sendMessage(employee, message);
    }

    @Override
    public boolean approveHolidayRequest() {
        if (!currentBillableDay().isEmployeeWorking(this)) {
            if (nextHolidayApprover == null) {
                System.out.println("Disapproved by " + this);
                return false;
            }

            return nextHolidayApprover.approveHolidayRequest();
        }

        System.out.println("Approved by " + this);
        return true;
    }

    @Override
    public HolidayApprover nextApprover() {
        return  nextHolidayApprover;
    }
}
