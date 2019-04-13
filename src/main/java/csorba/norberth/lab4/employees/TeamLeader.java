package csorba.norberth.lab4.employees;

import csorba.norberth.lab4.chain_of_responsibility.HolidayApprover;
import csorba.norberth.lab4.state.BillableDay;
import csorba.norberth.lab4.state.WorkingBillableDay;
import csorba.norberth.lab4.strategy.NotificationType;

public class TeamLeader implements Employee, HolidayApprover {

    private BillableDay crtBillableDay = new WorkingBillableDay();

    @Override
    public BillableDay currentBillableDay() {
        return crtBillableDay;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.SMS;
    }

    @Override
    public double crtDayPaycheck() {
        return 70 * crtBillableDay.paycheckCoeff();
    }

    @Override
    public void setCurrentBillableDay(BillableDay billableDay) {
        this.crtBillableDay = billableDay;
    }

    @Override
    public boolean approveHolidayRequest() {
        return this.crtBillableDay.isEmployeeInOffice(this);
    }

    @Override
    public HolidayApprover nextApprover() {
        return null;
    }
}
