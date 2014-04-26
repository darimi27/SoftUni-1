using System;
using System.Collections.Generic;
using System.Linq;

namespace JoroTheFootballPlayer
{
    class JoroTheFootballPlayer
    {
        static void Main()
        {
            string year = Console.ReadLine();
            decimal holidays = decimal.Parse(Console.ReadLine());
            decimal weekendsHometown = decimal.Parse(Console.ReadLine());

            decimal result = (holidays / 2);
            result += ((52 - weekendsHometown) / 3 ) * 2;
            result += weekendsHometown;

            if (year == "t")
            {
                result += 3;
            }

            Console.WriteLine((int)result);
        }
    }
}