// 1) Where is carNoise stored?
// global execution context - GEC
const carNoise = 'Honk';
// 2) Where is goFast stored?
// GEC
const goFast = speed => {
  // 4) When is speed assigned a value? Where is this value stored?
  // When goFast is called
  
  // 5) Where is makeNoise stored?
  // function execution context
  const makeNoise = sound => {
    console.log(`My speed is at ${speed}, time to ${sound}`);
  }

  // 6) What happens in the following statement?
  // Function callback with a carNoise parameter
  makeNoise(carNoise);
}

// 3) What happens in the following statement?
// 
if(confirm("Do you want to go fast?")) {
  goFast(80);
}
