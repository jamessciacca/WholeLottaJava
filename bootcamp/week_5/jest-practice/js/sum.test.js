//jest practice continued(this file is called - sum.test.js)

//next you need to import the sum function to your test file using the require key word
const sum = require('./sum')
//next you need to write your test function as written below

//first you start with a string explaining what exactly you want your function to do (this shows up in your console when you run jest so its best 
// to be as specific as possible so you can keep track of your tests!)
test('properly adds two numbers',

//next you need to write a function that gets called when you run your test
() => {
    //using the jest docs you can choose a pre-made function that applies to your syntax, in this case we are using the expect() function!
    //we use toBe because it is a child of expects and holds a value! the child you use depends on the data type you are testing
    //more children functions can be found on https://jestjs.io/docs/ !
    expect(sum(1, 2)).toBe(3)
})

//you are finished you can now run npm test in your terminal and will see that this test does indeed pass!



