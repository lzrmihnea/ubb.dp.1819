package csorba.norberth.lab4;

import csorba.norberth.lab4.chain_of_responsibility.HolidayApprover;
import csorba.norberth.lab4.employees.Developer;
import csorba.norberth.lab4.employees.Employee;
import csorba.norberth.lab4.employees.ProjectManager;
import csorba.norberth.lab4.employees.TeamLeader;
import csorba.norberth.lab4.state.HolidayBillableDay;
import csorba.norberth.lab4.state.SickLeaveBillableDay;
import csorba.norberth.lab4.state.UnpaidLeaveBillableDay;
import csorba.norberth.lab4.state.WorkingBillableDay;

public class Company {

    public static void main(String[] args) {
        Employee dev, leader, manager;
        dev = new Developer();
        manager = new ProjectManager((TeamLeader) (leader = new TeamLeader()));

        System.out.println("===Paychecks===\n");
        printPaychecks(manager);
        System.out.println();
        printPaychecks(leader);
        System.out.println();
        printPaychecks(dev);
        System.out.println();

        System.out.println("===HolidayApproval===\n");
        HolidayApprover approver = (ProjectManager) manager;
        System.out.println("ProjectManager is at the office");
        manager.setCurrentBillableDay(new WorkingBillableDay());
        System.out.println(approver.approveHolidayRequest());
        System.out.println("ProjectManager is in holiday but TeamLeader is at the office");
        manager.setCurrentBillableDay(new HolidayBillableDay());
        leader.setCurrentBillableDay(new WorkingBillableDay());
        System.out.println(approver.approveHolidayRequest());
        System.out.println("Neither ProjectManager nor TeamLeader are at the office");
        leader.setCurrentBillableDay(new HolidayBillableDay());
        System.out.println(approver.approveHolidayRequest());

        System.out.println("===HolidayApproval Notifications===\n");
        System.out.println("Approval");
        leader.setCurrentBillableDay(new WorkingBillableDay());
        approveHolidayRequest(dev, approver);
        System.out.println("Rejection");
        leader.setCurrentBillableDay(new HolidayBillableDay());
        approveHolidayRequest(manager, approver);
    }

    private static void printPaychecks(Employee employee) {
        System.out.println(employee.getClass().getSimpleName());
        System.out.println("working day - " + employee.crtDayPaycheck());
        employee.setCurrentBillableDay(new SickLeaveBillableDay());
        System.out.println("sick leave - " + employee.crtDayPaycheck());
        employee.setCurrentBillableDay(new UnpaidLeaveBillableDay());
        System.out.println("unpaid leave - " + employee.crtDayPaycheck());

    }

    private static void approveHolidayRequest(Employee employee, HolidayApprover approver) {
        String msg = approver.approveHolidayRequest() ? ", your holiday request was approved" : ", your holiday request was rejected";
        employee.notificationMechanism().getStrategy().sendMessage(employee, msg);
    }
}
