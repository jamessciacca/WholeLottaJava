const { Sequelize } = require('sequelize');
require('dotenv').config();

const connection = new Sequelize(
    process.env.DB_DATABASE,
    process.env.DB_USERNAME,
    process.env.DB_PASSWORD, {
    host: 'localhost',
    dialect: 'mysql',
    logging: false
});

module.exports = connection;
