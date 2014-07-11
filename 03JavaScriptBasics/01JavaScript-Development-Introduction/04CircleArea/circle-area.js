(function() {
  'use strict';

  var button = document.getElementsByTagName('button')[0];

  button.addEventListener('click', calculateCicleArea, false);

  function calculateCicleArea() {
    var radius = parseFloat(document.getElementsByTagName('input')[0].value),
        area = Math.PI * radius * radius;

    document.getElementById('output').innerHTML += '<p>Radius: ' + radius + '; Area: ' + area;
  }

}());
