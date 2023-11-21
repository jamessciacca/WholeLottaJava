
// kinda looks like
// const localStorage = {
//     tutorInfo: 'byron',
//     food: 'bacon',
//     getItem: function(keyToGet) {},
//     setItem: function(keyToStore, dataToStor) {}
// }

// rule 1) anytime you want to store data in LS, turn it into a json string first
const students = ['byron', 'james'];
// two steps
// const studentsAsString = JSON.stringify(students)
// localStorage.setItem('myStudents', studentsAsString)
// on step
localStorage.setItem('myStudents', JSON.stringify(students))


// rule 2) anytime you want to get something from LS turn it back into JS first
// two steps
// const studentListAsString = localStorage.getItem('myStudents');
// const studentList = JSON.parse(studentListAsString);
// one step
const studentList = JSON.parse(localStorage.getItem('myStudents'));

// exception to these rules is sending a number - dont stringify



// useful thing to remember
// -- if you ask ls for a key that it doesnt have, it will return null
const moneyMoney = localStorage.getItem('millionDollars'); // return null
console.log(moneyMoney) // log 'null'

// pattern for updating an existing obj or array in ls
// when you want to update a ls item that is a array or obj
// -- go get the current value
// -- parse it into js
// -- manipulate how you want
// -- use setItem w/ the same key to override it

const newStudent = 'dave';
const currentStudentArray = JSON.parse(localStorage.getItem('myStudents')); // array w/ 2 strings
currentStudentArray.push(newStudent); // manipulate the value
localStorage.setItem('myStudents',JSON.stringify(currentStudentArray));




