// leave comments to see what the values are

function one() {

}

const result1 = one();
// result one will be undefined
console.log(result1);

const result2 = one(10);
// result two will be undefined also because the function is not returning anything
console.log(result2);

function two() {
  return 3;
}

const result3 = two();
// result three will return 3
console.log(result3);

const result4 = two(5);
//result four will also return 3
console.log(result4);

function three(arg) {
  return arg;
}

const result5 = three('some string');

const result6 = three({ name: 'JD', age: 43 });

const result7 = three(['apple', 'orange', 'grape']);

// result 5,6,7 will simply return the parameter they pass in!
console.log(result5);
console.log(result6);
console.log(result7);

function four(arg) {
  const setter = () => { };

  return [arg, setter];
}

const result8 = four();
// result 8 will return undefined and the setter function in an array!
console.log(result8);

const result9 = four(10);
// result 9 will return 10, and an empty setter function also!
console.log(result9);

const [a, b] = four(15);
//const [a, b] will return the arg and an empty setter as well
console.log([a, b]);