package popa.catalin.lab4.employees;

import popa.catalin.lab4.chain_of_responsibility.HolidayApprover;
import popa.catalin.lab4.state.BillableDay;
import popa.catalin.lab4.strategy.NotificationType;

public interface Employee extends HolidayApprover {
    default void notifyEmployee(String message) {
        notificationMechanism().sendMessage(this, message);
    }

    double payPerDay();

    default double billableAmount() {
        return payPerDay() * currentBillableDay().percentagePaid(this);
    }

    BillableDay currentBillableDay();

    void setBillableDay(BillableDay billableDay);

    NotificationType notificationMechanism();
}
