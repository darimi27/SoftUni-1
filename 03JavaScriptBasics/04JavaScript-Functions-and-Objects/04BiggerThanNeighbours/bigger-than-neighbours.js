(function() {
  'use strict';

  function biggerThanNeighbours(index, arr) {
    if (!arr[index]) {
      return 'Invalid index';
    }

    if (index === 0 || index === arr.length-1) {
      return 'Only one neighbour';
    }

    if (arr[index - 1] < arr[index] && arr[index] > arr[index + 1]) {
      return 'Bigger than neighbours';
    } else {
      return 'Not bigger than neighbours';
    }
  }

  console.log(biggerThanNeighbours(2, [1, 2, 3, 3, 5]));
  console.log(biggerThanNeighbours(2, [1, 2, 5, 3, 4]));
  console.log(biggerThanNeighbours(5, [1, 2, 5, 3, 4]));
  console.log(biggerThanNeighbours(0, [1, 2, 5, 3, 4]));

}());
