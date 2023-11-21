const express = require('express');
const api_routes = require('./routes/api_routes')
const PORT = process.env.PORT || 3000;

const app = express();


app.use('/api', api_routes);


app.listen(PORT, () => console.log('Server Running on %s', PORT))