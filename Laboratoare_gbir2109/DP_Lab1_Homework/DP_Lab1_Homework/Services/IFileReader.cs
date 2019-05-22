using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public interface IFileReader
    {
        string[] GetAllLines(string file);
    }
}
