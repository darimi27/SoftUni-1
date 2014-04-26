using System;
using System.Collections.Generic;
using System.Linq;

namespace HalfSum
{
    class Program
    {
        static void Main()
        {
            int numberCount = int.Parse(Console.ReadLine());
            long[] numbers = new long[numberCount * 2];

            for (int i = 0; i < numberCount*2; i++)
            {
                numbers[i] = long.Parse(Console.ReadLine());
            }

            long leftSum = 0;
            long rightSum = 0;

            for (int i = 0; i < numberCount; i++)
            {
                leftSum += numbers[i];
            }

            for (int i = numberCount; i < numberCount*2; i++)
            {
                rightSum += numbers[i];
            }

            if (leftSum == rightSum)
            {
                Console.WriteLine("Yes, sum=" + leftSum);
            }
            else
            {
                Console.WriteLine("No, diff=" + Math.Abs(leftSum-rightSum));
            }
        }
    }
}