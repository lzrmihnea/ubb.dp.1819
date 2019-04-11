package ro.ubb.dp1819.lab4.exercises.chain_of_responsibility;

public interface HolidayApprover {

    boolean approveHolidayRequest();

    HolidayApprover nextApprover();

}
