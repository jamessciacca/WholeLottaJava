// TODO: Import express
const express = require('express')
const path = require('path')
// TODO: Import 'terms.json' file
const data = require('./terms.json')
const PORT = 3001;

// TODO: Initialize app variable
const app = express();
// TODO: Create a route for a GET request that will return the content of our `terms.json` file
app.get('/', (client_request_obj, server_response_obj)=> {
    server_response_obj.send('hello world');
});


app.get('/api', (client_request_obj, server_response_obj)=> {
  server_response_obj.json(data);
});


app.listen(PORT, () =>
  console.log(`Example app listening at http://localhost:${PORT}`)
);
