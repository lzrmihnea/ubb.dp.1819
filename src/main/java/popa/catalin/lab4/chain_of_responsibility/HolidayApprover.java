package popa.catalin.lab4.chain_of_responsibility;

public interface HolidayApprover {
    boolean approveHolidayRequest();

    HolidayApprover nextApprover();

    void setNextApprover(HolidayApprover nextApprover);
}
