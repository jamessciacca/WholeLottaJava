const mongoose = require('mongoose');

// TODO: Define a new schema named `bookSchema` for the subdocument
const bookSchema = new mongoose.Schema({
  title: { type: String, required: true },
  price: { type: Number, required: true }
});

const librarySchema = new mongoose.Schema({
  name: { type: String, required: true },
  //
  // TODO: Add the `books` subdocument to the parent document as an array
  const bookData = [
    { title: 'The Road Ahead', price: 5 },
    { title: 'Walter Isaacson', price: 15 },   
  ];
});
// TODO: Create a model named `Library`

// TODO: Create a new instance of the model including the subdocuments

module.exports = Library;
