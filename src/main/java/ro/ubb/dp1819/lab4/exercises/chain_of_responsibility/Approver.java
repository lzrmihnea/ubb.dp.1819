package ro.ubb.dp1819.lab4.exercises.chain_of_responsibility;

import ro.ubb.dp1819.lab4.exercises.Employee;

import java.util.Random;

public class Approver implements HolidayApprover {

    public Approver(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    private Approver nextApprover;

    private Employee employee;

    @Override
    public boolean approveHolidayRequest() {
        Random random = new Random();
        int val = random.nextInt(10);
        if (val > 5){
            System.out.println("Not in office");
            if (nextApprover!=null){
                return nextApprover.approveHolidayRequest();
            } else {
                return false;
            }
        }
        System.out.println("In office, request approved");
        return true;
    }

    @Override
    public HolidayApprover nextApprover() {
        if (nextApprover == null){
            nextApprover = new Approver(null);
            return nextApprover;
        } else {
            return nextApprover.nextApprover();
        }
    }

    public Approver getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
