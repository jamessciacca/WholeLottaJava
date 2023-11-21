// WRITE YOUR CODE HERE
var students = ['James', 'John', 'Paul', 'Luke'];

// variable old wil store 'James' within it so we can use it for 
// boolean statement!
var old = students[0];
students[0] = 'Ryan';

console.log('Welcome to the Class ' + students[0]);
console.log('Welcome to the Class ' + students[1]);
console.log('Welcome to the Class ' + students[2]);
console.log('Welcome to the Class ' + students[3]);

// if the first item of the array is not = to "james" then console log 
if (students[0] !== old){
    console.log(students[0] + ' is in class');
}

