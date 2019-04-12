package ro.ubb.dp1819.lab4.exercises;

import ro.ubb.dp1819.lab4.exercises.chain_of_responsibility.BaseHolidayApprover;

import static ro.ubb.dp1819.lab4.exercises.Constants.TEAM_LEADER_PAYCHECK;

public class TeamLeader extends BaseHolidayApprover {

    public TeamLeader() {
        super(TEAM_LEADER_PAYCHECK);
    }

}
