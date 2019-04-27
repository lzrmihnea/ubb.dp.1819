package popa.catalin.lab4;

import popa.catalin.lab4.employees.*;
import popa.catalin.lab4.state.Days;

public class Company {

    public static void main(String[] args) {
        Employee projectManager = new ProjectManager();
        Employee dev = new Developer();
        Employee lead = new TeamLeader();
        projectManager.setNextApprover(lead);

        System.out.println(projectManager.billableAmount() + " " + dev.billableAmount());
        lead.notifyEmployee(Boolean.toString(projectManager.approveHolidayRequest()));

        projectManager.setBillableDay(Days.SickLeave);
        dev.setBillableDay(Days.HomeOffice);

        System.out.println(projectManager.billableAmount() + " " + dev.billableAmount());
        dev.notifyEmployee(Boolean.toString(projectManager.approveHolidayRequest()));
    }
}
