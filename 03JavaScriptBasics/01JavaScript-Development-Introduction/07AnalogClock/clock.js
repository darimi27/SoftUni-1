(function() {
  'use strict';

  var hoursClockHand = document.getElementById('hours'),
      minutesClockHand = document.getElementById('minutes'),
      secondsClockHand = document.getElementById('seconds');

  setInterval(function() {
    var now = new Date(),
      hours = now.getHours(),
      minutes = now.getMinutes(),
      seconds = now.getSeconds();

      if (hours > 12) {
        hours = hours - 12;
      }

      if (minutes > 30) {
        setRotation(hoursClockHand, hours*45);
      } else {
        setRotation(hoursClockHand, hours*30);
      }

      setRotation(minutesClockHand, minutes*6);
      setRotation(secondsClockHand, seconds*6);
  }, 1000);

  function setRotation(element, degrees) {
    element.style.webkitTransform = 'rotate(' + degrees + 'deg)';
    element.style.MozTransform = 'rotate(' + degrees + 'deg)';
    element.style.msTransform = 'rotate(' + degrees + 'deg)';
    element.style.OTransform = 'rotate(' + degrees + 'deg)';
    element.style.transform = 'rotate(' + degrees + 'deg)';
  }
}());
