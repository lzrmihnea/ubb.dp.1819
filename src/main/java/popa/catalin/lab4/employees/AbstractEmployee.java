package popa.catalin.lab4.employees;

import popa.catalin.lab4.chain_of_responsibility.HolidayApprover;
import popa.catalin.lab4.state.BillableDay;
import popa.catalin.lab4.state.Days;

public abstract class AbstractEmployee implements Employee {
    private BillableDay billableDay = Days.Working;
    private HolidayApprover nextApprover;

    public BillableDay currentBillableDay() {
        return billableDay;
    }

    public void setBillableDay(BillableDay billableDay) {
        this.billableDay = billableDay;
    }

    public boolean approveHolidayRequest() {
        return false;
    }

    public HolidayApprover nextApprover(){
        return nextApprover;
    }

    public void setNextApprover(HolidayApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}
