const express = require('express');
const fs = require('fs');
const nodemon = require('nodemon');
const path = require('path');
const PORT = 3000;

const app = express();

app.use(express.static('public'));

//this is a simple route that sends a string!
app.get('/', (req, res) => {
    res.send("TEST")
})

app.get('/', (req, res) => {
    //the path.join literally joins the dirname with the string location you provide!!!
    res.sendFile(path.join(__dirname, 'public/index.html'));
})

app.post('/', (req, res) => {
    console.log("Post Request Made!");
})

console.log(__dirname)


app.listen(PORT, () => {
    console.log('Listening on Port %s', PORT);
})