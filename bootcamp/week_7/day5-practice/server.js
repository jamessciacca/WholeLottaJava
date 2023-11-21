const express = require('express');
const PORT = process.env.PORT || 3000;
const db = require('./config/connection');
const api_routes = require('./routes/api_routes')

const app = express();

app.use(express.json());

app.use(express.static('public'));

//adding api routes to server
app.use('/api', api_routes)

//we use force true to delete the existing database and create a new one
//use false to stop this from happening
db.sync({force: false}).then(() => {
    app.listen(PORT, () => console.log('Server is listening on port %s', PORT));
});