const fs = require('fs');
const inquirer = require('inquirer');

inquirer.prompt([

    {
        name: 'name',
        message: 'Please Enter Your Name',

    },
    {
        name: 'location',
        message: 'Please Enter Your Location',

    },
    {
        name: 'bio',
        message: 'Please enter something about yourself!',

    },
    {
        name: 'LinkedIn',
        message: 'Please Enter Your LinkedIn URL',

    },
    {
        name: 'GitHub',
        message: 'Please Enter Your GitHub URL',

    }
]).then((answersObj) => {
    fs.writeFile('./index.html',
    
    `
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel ='stylesheet' href='style.css'>
    </head>
    <body>
        <img src='https://c8.alamy.com/comp/M099B4/stevo-at-the-us-weekly-holiday-event-at-smashbox-studios-culver-city-M099B4.jpg'>
        <h2>Name: ${answersObj.name}</h2>
        <h5>Location: ${answersObj.location}</h5>
        <p>Bio: ${answersObj.bio}</p>
        <div>
        <a href='${answersObj.LinkedIn}'>LinkedIn</a>
        </div>
        <a href='${answersObj.GitHub}'>GitHub</a>
    </body>
    </html>
    `, 
    
    (err) => {
        if (err)
            //you don't need curly braces when you only have one argument in the if statement
            return console.log(err);
    
            console.log('file written successfully!');
    });
});




