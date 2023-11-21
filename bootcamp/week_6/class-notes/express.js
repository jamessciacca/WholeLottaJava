const express = require('express');

// makes express an object so you can have multiple servers!
const app = express();

app.get('/', (client_request_obj, server_response_obj)=> {
    server_response_obj.send('hi there!');
});

app.listen(3000, ()=> {
    console.log('Server Started')
})

//npm i express
//run localhost:3000 in browser to see your message!!!