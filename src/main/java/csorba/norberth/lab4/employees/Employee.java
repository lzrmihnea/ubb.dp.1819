package csorba.norberth.lab4.employees;

import csorba.norberth.lab4.state.BillableDay;
import csorba.norberth.lab4.strategy.NotificationType;

public interface Employee {

    BillableDay currentBillableDay();

    NotificationType notificationMechanism();

    double crtDayPaycheck();

    //it is possible to move from any state to any other state
    void setCurrentBillableDay(BillableDay billableDay);

}
