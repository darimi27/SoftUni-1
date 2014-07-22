(function() {
  'use strict';

  function findYoungest(people) {
    var minAge = Number.MAX_VALUE,
        name = '';

    people.forEach(function(person) {
      if (person.age && person.age < minAge) {
        minAge = person.age;
        name = person.firstname + ' ' + person.lastname;
      }
    });

    return name;
  }

  var persons = [
    { firstname : 'George', lastname: 'Kolev', age: 32},
    { firstname : 'Bay', lastname: 'Ivan', age: 81},
    { firstname : 'Baba', lastname: 'Ginka', age: 40}];

  console.log('The youngest person is ' + findYoungest(persons));

}());
