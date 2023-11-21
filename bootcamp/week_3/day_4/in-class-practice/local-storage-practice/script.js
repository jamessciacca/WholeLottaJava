var score = 5;

localStorage.setItem('userScore', score);


var score = localStorage.getItem('userScore');

var fruits = ['orange', 'apple', 'grape'];

localStorage.setItem('fruits', JSON.stringify(fruits));

var fruitData = JSON.parse(localStorage.getItem('fruits'));

console.log(fruitData);