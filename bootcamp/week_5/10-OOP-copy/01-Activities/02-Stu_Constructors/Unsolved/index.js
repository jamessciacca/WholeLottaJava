const dayjs = require('dayjs');
// TODO: Create a constructor function called 'BlogPost' that takes in 'authorName', 'title', 'text, and 'createdOn'
function BlogPost(authorName, title, createdOn){
    this.authorName = authorName;
    this.title = title;
    this.createdOn = createdOn;
    this.printMetaData = function(){
        console.log('Created by - ' + authorName + ', Created on - ' + createdOn)
    };
}


const date = new dayjs().format('MM, DD, YYYY')
const post = new BlogPost('James', 'OOP Day 1', date);


post.printMetaData();
// TODO: Include a method called 'printMetaData()' that prints a message in the console saying 'Created by (authorName) on (createdOn)'

// TODO: Create a new object using the 'BlogPost' constructor

// TODO: Call the 'printMetaData()' method on the new object
