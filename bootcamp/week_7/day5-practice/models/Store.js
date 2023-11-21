const {Model, DataTypes} = require('sequelize');
const db = require('../config/connection');

class Store extends Model {}

Store.init({
    name: {
        type: DataTypes.STRING,
        unique: true
    },
    location: {
        type: DataTypes.STRING,
        allowNull: false
    }
}, {
    sequelize: db,
    modelName: 'store',
    timestamps: false
});

module.exports = Store;