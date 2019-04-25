package popa.catalin.lab4.state;

import popa.catalin.lab4.employees.Employee;

public enum Days implements BillableDay {
    Holiday {
        @Override
        public double percentagePaid(Employee employee) {
            return 1; // ~~ Holiday is paid leave, so you DO get paid
        }

        @Override
        public boolean isEmployeeWorking(Employee employee) {
            return false;
        }

        @Override
        public boolean isEmployeeInOffice(Employee employee) {
            return false;
        }
    },
    HomeOffice {
        @Override
        public double percentagePaid(Employee employee) {
            return 1;
        }

        @Override
        public boolean isEmployeeWorking(Employee employee) {
            return true;
        }

        @Override
        public boolean isEmployeeInOffice(Employee employee) {
            return false;
        }
    },
    SickLeave {
        @Override
        public double percentagePaid(Employee employee) {
            return 0.5;
        }

        @Override
        public boolean isEmployeeWorking(Employee employee) {
            return false;
        }

        @Override
        public boolean isEmployeeInOffice(Employee employee) {
            return false;
        }
    },
    UnpaidLeave {
        @Override
        public double percentagePaid(Employee employee) {
            return 0;
        }

        @Override
        public boolean isEmployeeWorking(Employee employee) {
            return false;
        }

        @Override
        public boolean isEmployeeInOffice(Employee employee) {
            return false;
        }
    },
    Working {
        @Override
        public double percentagePaid(Employee employee) {
            return 1;
        }

        @Override
        public boolean isEmployeeWorking(Employee employee) {
            return true;
        }

        @Override
        public boolean isEmployeeInOffice(Employee employee) {
            return true;
        }
    }
}
