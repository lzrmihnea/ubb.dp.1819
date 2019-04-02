using System.Collections.Generic;
using System.IO;

namespace CoffeeMachine
{
	public class FileService
	{
		public static List<string> ReadLines(string path)
		{
			if (!File.Exists(path))
				throw new FileNotFoundException($"The file \"{path}\" does not exist.");

			var lines = (new List<string>(File.ReadAllLines(path)));

			// Remove excess white space
			lines.ForEach(line => line.Trim());

			return lines;
		}

	}
}
