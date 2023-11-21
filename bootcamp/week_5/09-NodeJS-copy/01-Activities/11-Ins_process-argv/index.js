// returns an array of command line arguments
// console.log(process.argv);

// arguments passed from the command line are accessed by index
// console.log(process.argv[2]);


//class practice 

const operation = process.argv[2];
const num1 = parseInt(process.argv[3]);
const num2 = parseInt(process.argv[4]);

console.log(num2)

console.log(process.argv)

//The reason num1 is at array index 3 is because index 0
//is node, index 1 is the path for the index.js file, 
//operation is at index 2 and then finally index 3 = num1 and so on!

//THIS IS THE FILE PATH EXAMPLE
// 'C:\\Program Files\\nodejs\\node.exe',
// 'C:\\Users\\James Sciacca\\bootcamp\\week_5\\09-NodeJS-copy\\0
// 1-Activities\\11-Ins_process-argv\\index.js',
//   'sum',
//   '1',
//   '5'

if(operation === 'sum'){
    console.log(num1 + num2);
}

//because we don't want the strings to concatenate we have to parse in to actually add the values together!


