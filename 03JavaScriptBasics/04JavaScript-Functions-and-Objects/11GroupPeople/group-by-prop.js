(function() {
  'use strict';

  function groupBy(collection, property) {
    var group = {};

    collection.forEach(function(item) {
      if (group[item[property]]) {
        group[item[property]].push(item);
      } else {
        group[item[property]] = [item];
      }
    });

    return group;
  }

  var people = [
    { fname: 'Scott', lname: 'Guthrie', age: 38 },
    { fname: 'Scott', lname: 'Johns', age: 36 },
    { fname: 'Scott', lname: 'Hanselman', age: 39 },
    { fname: 'Jesse', lname: 'Liberty', age: 57 },
    { fname: 'Jon', lname: 'Skeet', age: 38 }];

  console.log(groupBy(people, 'fname'));
  console.log('=======================');
  console.log(groupBy(people, 'age'));
  console.log('=======================');
  console.log(groupBy(people, 'lname'));

}());
