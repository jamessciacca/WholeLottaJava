const {Model, DataTypes} = require('sequelize');
const db = require('../config/connection');

class Book extends Model {}

Book.init({
   title: {
        type: DataTypes.STRING,
        unique: true
    },
    author: {
        type: DataTypes.STRING,
        allowNull: false
    },
    
    instock: {
        type: DataTypes.BOOLEAN,
        defaultValue: true
    }
}, {
    sequelize: db,
    modelName: 'book',
    timestamps: false
});

module.exports = Book;