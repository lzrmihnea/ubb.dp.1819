package popa.catalin.lab4;

import popa.catalin.lab4.employees.AbstractEmployee;
import popa.catalin.lab4.employees.Developer;
import popa.catalin.lab4.employees.Employee;
import popa.catalin.lab4.employees.ProjectManager;
import popa.catalin.lab4.state.Days;

public class Company {

    public static void main(String[] args) {
        Employee projectManager = new ProjectManager();
        Employee dev = new Developer();
        System.out.println(projectManager.currentBillableDay().toString());

        projectManager.setBillableDay(Days.Holiday);
        dev.setBillableDay(Days.HomeOffice);
    }
}
