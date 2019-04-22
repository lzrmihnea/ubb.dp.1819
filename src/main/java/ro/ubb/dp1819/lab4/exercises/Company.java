package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.BaseHolidayApprover;
import ro.ubb.dp1819.lab4.exercises.state.Holiday;
import ro.ubb.dp1819.lab4.exercises.state.SickLeave;
import ro.ubb.dp1819.lab4.exercises.state.UnpaidLeave;
import ro.ubb.dp1819.lab4.exercises.strategy.EmailNotification;
import ro.ubb.dp1819.lab4.exercises.strategy.NotificationType;
import ro.ubb.dp1819.lab4.exercises.strategy.PushNotification;
import ro.ubb.dp1819.lab4.exercises.strategy.SmsNotification;

import java.util.Arrays;
import java.util.List;

import static ro.ubb.dp1819.lab4.exercises.utils.Constants.APPROVED;
import static ro.ubb.dp1819.lab4.exercises.utils.Constants.DISAPPROVED;

public class Company {

    public static void main(String[] args) {
        final BaseEmployee developer1 = new Developer();
        final BaseEmployee developer2 = new Developer();
        final BaseEmployee developer3 = new Developer();

        developer1.setCurrentBillableDay(new Holiday());
        developer2.setCurrentBillableDay(new UnpaidLeave());

        developer1.setNotificationType(NotificationType.EMAIL);
        developer2.setNotificationType(NotificationType.PUSH_NOTIFICATION);
        developer3.setNotificationType(NotificationType.SMS);

        System.out.println("Developer #1 paycheck" + developer1.getBillableDayPaycheck());
        System.out.println("Developer #2 paycheck" + developer2.getBillableDayPaycheck());

        final BaseHolidayApprover projectManager = new ProjectManager();
        final BaseHolidayApprover teamLeader = new TeamLeader();

        projectManager.setCurrentBillableDay(new SickLeave());

        projectManager.setNextHolidayApprover(teamLeader);

        final List<BaseEmployee> employees = Arrays.asList(developer1, developer2, developer3);

        for (BaseEmployee employee : employees) {
            switch (employee.notificationMechanism()) {
                case EMAIL:
                    projectManager.setNotificationStrategy(new EmailNotification());
                    break;
                case PUSH_NOTIFICATION:
                    projectManager.setNotificationStrategy(new PushNotification());
                    break;
                case SMS:
                    projectManager.setNotificationStrategy(new SmsNotification());
                    break;
            }

            final String message = projectManager.approveHolidayRequest() ? APPROVED : DISAPPROVED;

            projectManager.notifyEmployee(employee, message);
        }

    }
}
