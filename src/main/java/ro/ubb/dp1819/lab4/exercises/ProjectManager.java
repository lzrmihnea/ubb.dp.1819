package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.BaseHolidayApprover;
import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.HolidayApprover;

import static ro.ubb.dp1819.lab4.exercises.Constants.PROJECT_MANAGER_PAYCHECK;

public class ProjectManager extends BaseHolidayApprover implements Employee, HolidayApprover {

    public ProjectManager() {
        super(PROJECT_MANAGER_PAYCHECK);
    }

}
