using System.Collections.Generic;

namespace LeaveDays
{
    public class Company
    {
        public string Name { get; set; }

        public Company(string name)
        {
            Name = name;
            Employees = new List<Employee>();
        }

        public List<Employee> Employees { get; set; }
    }
}