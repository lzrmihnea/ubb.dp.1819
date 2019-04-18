package ro.ubb.dp1819.lab4.exercises.state;

import ro.ubb.dp1819.lab4.exercises.Employee;

public class HomeOffice implements BillableDay {
    @Override
    public boolean isEmployeeWorking(Employee employee) {
        return true;
    }

    @Override
    public boolean isEmployeeInOffice(Employee employee) {
        return false;
    }

    @Override
    public double getPay(double rawPay) {
        return rawPay;
    }
}
