(function() {
  'use strict';

  Array.prototype.removeItem = function removeItem(value) {

    for (var i = 0; i < this.length; i++) {
      if (this[i] === value) {
        this.splice(i, 1);
        i -= 1;
      }
    }

    return this;
  };

  var arr = [1, 2, 1, 4, 1, 3, 4, 1, 111, 3, 2, 1, '1'];
  var arr2 = ['hi', 'bye', 'hello' ];

  console.log(arr);
  console.log(arr.removeItem(1));

  console.log('==================');

  console.log(arr2);
  console.log(arr2.removeItem('bye'));

}());
