(function() {
  'use strict';

  function reverseWords(text) {
    var reversed = text.split(' ').map(function(word) {
      return word.split('').reverse().join('');
    }).join(' ');

    return reversed;
  }

  console.log(reverseWords('Hello, how are you.'));
  console.log(reverseWords('Life is pretty good, isn’t it?'));

}());
