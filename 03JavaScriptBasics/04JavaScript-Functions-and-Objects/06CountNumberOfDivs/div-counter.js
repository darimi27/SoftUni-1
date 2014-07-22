(function() {
  'use strict';

  function divCounter(htmlString) {
    var divs = 0,
        index = htmlString.indexOf('<div');

    while (index >= 0) {
      divs += 1;
      index = htmlString.indexOf('<div', index + 1);
    }

    return divs;
  }

  var html = [
  '<!DOCTYPE html>',
  '<html>',
  '<head lang="en">',
      '<meta charset="UTF-8">',
      '<title>index</title>',
      '<script src="/yourScript.js" defer></script>',
  '</head>',
  '<body>',
      '<div id="outerDiv">',
          '<div class="first">',
              '<div><div>hello</div></div>',
          '</div>',
          '<div>hi<div></div></div>',
          '<div>I am a div</div>',
      '</div>',
  '</body>',
  '</html>'];

  console.log(divCounter(html.join('')));
}());
