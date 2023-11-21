const mysql = require('mysql2');

const connection = mysql.createConnection({
    user: 'root',
    password: '',
    database: ''
})

module.exports = connection;