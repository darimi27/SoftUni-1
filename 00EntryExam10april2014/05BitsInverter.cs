using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BitsInverter
{
    class BitsInverter
    {
        static void Main()
        {
            // input
            int count = int.Parse(Console.ReadLine());
            int step = int.Parse(Console.ReadLine());

            byte[] bits = new byte[count];
            for (int i = 0; i < count; i++)
            {
                bits[i] = byte.Parse(Console.ReadLine());
            }

            // solution
            StringBuilder converter = new StringBuilder();

            for (int i = 0; i < count; i++)
            {
                converter.Append(Convert.ToString(bits[i], 2).PadLeft(8, '0'));
            }

            // convert first bit
            if (converter[0] == '0')
            {
                converter[0] = '1';
            }
            else
            {
                converter[0] = '0';
            }

            int multiply = 1;

            // convert the rest of the bits
            for (int i = step; i < converter.Length; i = multiply * step)
            {
                if (converter[i] == '0')
                {
                    converter[i] = '1';
                }
                else
                {
                    converter[i] = '0';
                }

                multiply++;
            }

            // print out the bytes
            byte convertedByte = 0;
            string currenNum = String.Empty;
            for (int i = 0; i < converter.Length; i+=8)
            {
                currenNum = (converter[i].ToString() + converter[i + 1] + converter[i + 2] + converter[i + 3] +
                             converter[i + 4] + converter[i + 5] + converter[i + 6] + converter[i + 7]);
                convertedByte = Convert.ToByte(currenNum, 2);
                Console.WriteLine(convertedByte);
            }
        }
    }
}