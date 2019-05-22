using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework
{
    public class KillCounterObserver : IObserver
    {
        private int kills = 0;
        public void Notify()
        {
            kills++;
            Console.WriteLine($"Kills: {kills}");
        }
    }
}
