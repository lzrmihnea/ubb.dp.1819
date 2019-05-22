using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework
{
    public class PrintObserver : IObserver
    {
        public void Notify()
        {
            Console.WriteLine("New attack occured!");
        }
    }
}
