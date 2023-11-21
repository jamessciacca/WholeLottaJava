function myCoolFunc() {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve();
      }, 4000);
    });
  }
  
  const promObj = myCoolFunc();
  
  promObj
    .then(() => {
      console.log('hey, show me!');
    })
    .then(() => {
      console.log('next thing');
    })
    .then(() => {
      console.log('one more');
    });



    const jdInquirer = {
        prompt(questionArr) {
          return new Promise((resolve, reject) => {
            // resolve one the terminal inputs have all completed
      
            // Loop over question array and prompt user in the terminal for each object in the array
            const answers = {
              something: 'Hey'
            }
      
            resolve(answers);
          });
        }
      };
      
      jdInquirer.prompt([
        {
          name: 'something',
          message: 'Hi there.'
        }
      ]).then((answersObj) => {
        console.log(answersObj);
      });
      
      
      
      
      
      function requestOne() {
        return new Promise((resolve, reject) => {
          setTimeout(() => {
            const url = 'some other api server url';
      
            resolve(url);
          }, 7000);
        });
      }
      
      function requestTwo(passed_url) {
        return new Promise((resolve, reject) => {
          setTimeout(() => {
            const somethingWithURL = passed_url + ' we did something';
            resolve(somethingWithURL);
          }, 4000);
        });
      }
      
      const starwarsRequest = requestOne();
      
      starwarsRequest
        .then(requestTwo)
        .then((something) => {
          console.log(something);
        });
      
      promObj
        .then(() => {
          console.log('hey, show me!');
        })
        .then(() => {
          console.log('next thing');
        })
        .then(() => {
          console.log('one more');
        });
