using System;
using System.Collections.Generic;
using System.Linq;

namespace Sunglasses
{
    class Sunglasses
    {
        static void Main()
        {
            // input
            int height = int.Parse(Console.ReadLine());

            // solution
            int width = 2 * height;
            int bridge = height;
            int lenses = width - 2;

            // first row
            Console.WriteLine(new string('*', width) + new string(' ', bridge) + new string('*', width));

            // to middle
            for (int i = 1; i <= height/2 - 1; i++)
            {
                Console.WriteLine('*' + new string('/', lenses) + '*' + new string(' ', bridge) + '*' + new string('/', lenses) + '*');
            }

            // middle row
            Console.WriteLine('*' + new string('/', lenses) + '*' + new string('|', bridge) + '*' + new string('/', lenses) + '*');

            // to bottom
            for (int i = height/2 + 1; i < height - 1; i++)
            {
                Console.WriteLine('*' + new string('/', lenses) + '*' + new string(' ', bridge) + '*' + new string('/', lenses) + '*');
            }

            // bottom row
            Console.WriteLine(new string('*', width) + new string(' ', bridge) + new string('*', width));
        }
    }
}