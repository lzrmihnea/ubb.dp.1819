package csorba.norberth.lab4.employees;

import csorba.norberth.lab4.chain_of_responsibility.HolidayApprover;
import csorba.norberth.lab4.state.BillableDay;
import csorba.norberth.lab4.state.WorkingBillableDay;
import csorba.norberth.lab4.strategy.NotificationType;

public class ProjectManager implements Employee, HolidayApprover {

    private BillableDay crtBillableDay = new WorkingBillableDay();
    private HolidayApprover nextApprover;

    public ProjectManager() {
    }

    public ProjectManager(TeamLeader nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public BillableDay currentBillableDay() {
        return crtBillableDay;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.PUSH_NOTIFICATION;
    }

    @Override
    public double crtDayPaycheck() {
        return 100 * crtBillableDay.paycheckCoeff();
    }

    @Override
    public void setCurrentBillableDay(BillableDay billableDay) {
        this.crtBillableDay = billableDay;
    }

    @Override
    public boolean approveHolidayRequest() {
        if (crtBillableDay.isEmployeeInOffice(this)) {
            return true;
        }
        if (this.nextApprover() != null) {
            return this.nextApprover().approveHolidayRequest();
        }
        return false;
    }

    @Override
    public HolidayApprover nextApprover() {
        return this.nextApprover;
    }
}
