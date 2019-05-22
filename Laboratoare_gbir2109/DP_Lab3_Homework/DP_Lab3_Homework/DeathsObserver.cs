using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework
{
    public class DeathsObserver : IObserver
    {
        public void Notify()
        {
            Console.WriteLine("New death occured"); ;
        }
    }
}
