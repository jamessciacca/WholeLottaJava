//day two notes on express.js and servers
const express = require('express');
//path helps you find direct paths to your documents
const path = require('path')
//declaring the port up here
const PORT = 3000;

const app = express();

//return the current working directory
// const dir = path.join(process.cwd());


app.use(express.static(path.join(process.cwd(), 'public_files')));


//get put post delete
//'/' refers to the root of the domain
//the other parameter is a call back function that runs
//when the user visits the path
app.get('/', (client_request_obj, server_response_obj)=> {
    //path to index.html file join literally joins the CWD with the file we want.
    const pathToIndex = path.join(process.cwd(), 'views/index.html');
    server_response_obj.sendFile(pathToIndex);
});

//this object takes a port and thats it
//optional argument is a callback so you know when the server is up and running
app.listen(PORT, () => {
    //%s is a place holder for data
    console.log('Server running on port %s', PORT)
});