(function() {
  'use strict';

  function isInteger(number) {
    if (typeof number === 'number' && parseInt(number, 10) === number) {
      return true;
    }

    return false;
  }

  function findLargestSumOfDigits() {
    var numbers = Array.prototype.slice.call(arguments),
        currentNum = 0,
        currentDigitSum = 0,
        largestDigitSum = 0,
        numberWithLargestDigitSum;

    for (var i = 0; i < numbers.length; i++) {
      if (!isInteger(numbers[i])) {
        return;
      }

      currentNum = Math.abs(numbers[i]);
      currentDigitSum = 0;
      while (currentNum > 0) {
        currentDigitSum += currentNum % 10;
        currentNum = Math.floor(currentNum / 10);
      }

      if (currentDigitSum > largestDigitSum) {
        largestDigitSum = currentDigitSum;
        numberWithLargestDigitSum = numbers[i];
      }
    }

    return numberWithLargestDigitSum;
  }

  console.log(findLargestSumOfDigits(5, 10, 15, 111));
  console.log(findLargestSumOfDigits(33, 44, -99, 0, 20));
  console.log(findLargestSumOfDigits('hello'));
  console.log(findLargestSumOfDigits(5, 3.3));

}());
