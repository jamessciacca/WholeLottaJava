//calling in the dotenv package we installed
require('dotenv').config();

//pulling in express
const express = require('express');
//pulling in path
const path = require('path')
//variable for the port pulled from the .env file we made
//either use heroku or 3000 if on local system
const PORT = process.env.PORT || 3000;

//creating a new express object
const app = express();

//requiring our view_routes
const view_routes = require('./routes/view_routes.js');
//api routes
const api_routes = require('./routes/api_routes.js');

//sharing some frontend files
//express.static shares files
//in this case the user can see the style.css and browser.js when they get request to the server
app.use(express.static('public'));

//mounts or puts the specified middleware functions at the specified path
app.use('/', view_routes);
app.use('/', api_routes)

//route listener
app.get('/', (client_request, server_response)=>{
    server_response.sendFile(path.join(process.cwd(), './views/landing.html'));
});

//server must be listening
app.listen(PORT, () => console.log('Listening on port %s', PORT));

//notes
//index.html will always be loaded first! (naming does matter)
