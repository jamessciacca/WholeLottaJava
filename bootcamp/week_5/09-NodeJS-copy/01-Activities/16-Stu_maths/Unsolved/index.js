// TODO: Import `maths.js`
const maths = require('./maths.js')
// console.log(process.argv)
// TODO: Capture the values passed from the command line into these three variables: `operation`, `numOne` and `numTwo`
const operator = process.argv[2]
const num1 = parseInt(process.argv[3])
const num2 = parseInt(process.argv[4])
let result;

console.log(operator, num1, num2)
// TODO: Create a `switch` statement that accepts an `operation` parameter
// and each `case` uses the corresponding `maths` method
if(operator === 'sum'){
    result = num1 + num2
}
if(operator === 'difference'){
    result = num1 - num2
}
if(operator === 'product'){
    result = num1 * num2
}
if(operator === 'quotient'){
    result = num1 / num2
}
console.log(result)
// to perform each math operation on the two numbers, `numOne` and `numTwo`



