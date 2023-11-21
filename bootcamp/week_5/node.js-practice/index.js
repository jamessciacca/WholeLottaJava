// var age = 99;
// // storing a comparison to a variable 
// var isOld = age > 80;


// console.log(isOld);

const fs = require('fs')

const age = 19;

//template literals
const myData = `
this is our text that we added

another line

more stuff

James is ${age}

${genLicense('MIT')}

`;


fs.writeFile('./data.txt', myData, (err) => {
    if (err)
        //you don't need curly braces when you only have one argument in the if statement
        return console.log(err);

        console.log('file written successfully!');
}); 



function genLicense(type){
    return `License Type: ${type}`;
}

const result = genLicense('MIT')

console.log(result);