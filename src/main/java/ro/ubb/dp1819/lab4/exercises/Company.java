package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.Approver;
import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.HolidayApprover;
import ro.ubb.dp1819.lab4.exercises.state.HomeOffice;
import ro.ubb.dp1819.lab4.exercises.state.SickLeave;
import ro.ubb.dp1819.lab4.exercises.state.Working;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationType;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Dev(123,new Working(),NotificationType.PUSH_NOTIFICATION);
        Employee employee2 = new Dev(5432,new HomeOffice(),NotificationType.PUSH_NOTIFICATION);
        Employee employee3 = new Dev(6233,new Working(),NotificationType.PUSH_NOTIFICATION);
        Employee employee4 = new Dev(543,new SickLeave(),NotificationType.PUSH_NOTIFICATION);
        Employee teamLead = new TL(7653,new Working(),NotificationType.EMAIL);
        Employee projectManager = new PM(7653,new SickLeave(),NotificationType.SMS);

        HolidayApprover holidayApprover = new Approver(null);
        holidayApprover.nextApprover();
        holidayApprover.nextApprover();
        holidayApprover.nextApprover();




    }
}
