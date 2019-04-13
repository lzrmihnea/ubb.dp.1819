package csorba.norberth.lab4.chain_of_responsibility;

public interface HolidayApprover {

    boolean approveHolidayRequest();

    HolidayApprover nextApprover();

}
