using LeaveDays.Strategy;
using System;
using System.Collections.Generic;
using System.Linq;

namespace LeaveDays
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            var company = SeedCompany();
            var developer = company.Employees.Where(e => e.Name.Contains("Simona")).FirstOrDefault();
            if(developer!=null)
            {
                PrintHistory(developer);
                developer.MakeLeaveDayRequest(State.DayStatus.Holiday);
                PrintHistory(developer);
            }

            var teamLead = company.Employees.Where(e => e.Name.Contains("Vlad")).FirstOrDefault();
            if (teamLead != null)
            {
                PrintHistory(teamLead);
                teamLead.MakeLeaveDayRequest(State.DayStatus.UnpaidLeave);
                PrintHistory(teamLead);
            }

            var projectManager = company.Employees.Where(e => e.Name.Contains("Radu")).FirstOrDefault();
            if (projectManager != null)
            {
                PrintHistory(projectManager);
                projectManager.MakeLeaveDayRequest(State.DayStatus.SickLeave);
                PrintHistory(projectManager);
            }

            Console.WriteLine("Project manager not in the office");
            teamLead.ChangeStatus(State.DayStatus.Working);
            PrintHistory(developer);
            developer.MakeLeaveDayRequest(State.DayStatus.Holiday);
            PrintHistory(developer);



            Console.ReadKey();

        }

        static void PrintHistory(Employee employee)
        {
            Console.WriteLine($"--- History {employee.Name} ---");
            Console.WriteLine($"--- No Leave Days --- {employee.History.Count()}");
            foreach (var leaveDay in employee.History)
            {
                Console.Write($"{leaveDay.RequestDate.ToString()}  {leaveDay.DayStatus.ToString()}  {leaveDay.Status.ToString()}");
                if(leaveDay.Approver!=null)
                {
                    Console.Write($" {leaveDay.Approver.Name}");
                }
                Console.WriteLine();
            }
        }

        static Company SeedCompany()
        {
            Company company = new Company("Accesa");

            var teamleader = new TeamLeader("Vlad Tamas");

            var projectManager = new ProjectManager("Radu Vingan");
            projectManager.Approver = null;
            projectManager.SetNextApprover(teamleader);

            teamleader.SetNextApprover(null);
            teamleader.Approver = projectManager;
            teamleader.NotificationStrategy = new SmsStrategy();

            var developer = new Developer("Simona Burlacu");
            developer.Approver = projectManager;
            developer.NotificationStrategy = new EmailNotification();

            company.Employees = new List<Employee> { developer, teamleader, projectManager };
            return company;
        }

    }
}
