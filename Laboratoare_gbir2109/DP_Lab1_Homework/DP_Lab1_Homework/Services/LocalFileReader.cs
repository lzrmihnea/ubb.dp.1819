using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class LocalFileReader : IFileReader
    {
        public string[] GetAllLines(string filePath)
        {
            return File.ReadAllLines(filePath);
        }
    }
}
