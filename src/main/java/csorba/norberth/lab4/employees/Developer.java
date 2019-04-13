package csorba.norberth.lab4.employees;

import csorba.norberth.lab4.state.BillableDay;
import csorba.norberth.lab4.state.WorkingBillableDay;
import csorba.norberth.lab4.strategy.NotificationType;

public class Developer implements Employee {

    private BillableDay crtBillableDay = new WorkingBillableDay();

    @Override
    public BillableDay currentBillableDay() {
        return crtBillableDay;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.EMAIL;
    }

    @Override
    public double crtDayPaycheck() {
        return 50 * crtBillableDay.paycheckCoeff();
    }

    @Override
    public void setCurrentBillableDay(BillableDay billableDay) {
        this.crtBillableDay = billableDay;
    }
}
