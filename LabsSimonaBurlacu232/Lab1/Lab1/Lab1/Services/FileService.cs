using System.Collections.Generic;

namespace Lab1.Services
{
    public class FileService
    {
        private string filepath;

        public FileService(string filepath)
        {
            this.filepath = filepath;
        }

        public List<string> ReadLinesFromFile()
        {
            var listOfLines = new List<string>();
            var lines=System.IO.File.ReadAllLines(filepath);
            listOfLines.AddRange(lines);
            return listOfLines;
        }
    }
}
