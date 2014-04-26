using System;
using System.Collections.Generic;
using System.Linq;

namespace NineDigitMagicNumbers
{
    class NineDigitMagicNumbers
    {
        static void Main()
        {
            // input
            int sum = int.Parse(Console.ReadLine());
            int diff = int.Parse(Console.ReadLine());

            // solution
            if (sum < 9)
            {
                Console.WriteLine("No");
                return;
            }

            bool foundSolution = false;

            int firstNum = 0;
            int secondNum = 0;
            int thirdNum = 0;

            string currentNum = String.Empty;
            string resultingNum = String.Empty;            

            for (int one = 1; one <= 7; one++)
            {
                for (int two = 1; two <= 7; two++)
                {
                    for (int three = 1; three <= 7; three++)
                    {
                        currentNum = one.ToString() + two + three;

                        firstNum = int.Parse(currentNum);
                        secondNum = firstNum + diff;
                        thirdNum = secondNum + diff;

                        resultingNum = firstNum.ToString() + secondNum + thirdNum;
                        int totalSum = 0;
                        bool validNumbers = true;

                        for (int i = 0; i < resultingNum.Length; i++)
                        {
                            if (resultingNum[i] == '0' || resultingNum[i] == '8' ||
                                resultingNum[i] == '9' || resultingNum.Length > 9)
                            {
                                validNumbers = false;
                                break;
                            }

                            totalSum += int.Parse(resultingNum[i].ToString());
                        }

                        if (totalSum == sum && validNumbers)
                        {
                            foundSolution = true;
                            Console.WriteLine(resultingNum);
                        }
                    }
                }
            }

            if (!foundSolution)
            {
                Console.WriteLine("No");
            }
        }
    }
}