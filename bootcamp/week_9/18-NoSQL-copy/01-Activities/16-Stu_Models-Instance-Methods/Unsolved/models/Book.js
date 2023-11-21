const { Schema, model } = require('mongoose');

// TODO: Define a new schema named `bookSchema`
const bookSchema = new Schema({
    title: {
        type: String,
    },
    author: {
        type: String
    },
    price: {
        type: Number,
    }
});
// TODO: Create a custom instance method named `getDiscount`
bookSchema.methods.getDiscount = function () {
    let reducedPrice = this.price * 0.5;

    console.log(`"${this.title}" is now for ${reducedPrice}`);
}
// TODO: Create a model named `Book`
const Book = model('Book', bookSchema);
// TODO: Create a new instance of the model
const newBook = Book.create({
    title: 'The Lord of the Rings',
    author: 'J.R.R. Tolkien',
    price: 20
}).then((newBook) => {
    console.log(newBook);
    newBook.getDiscount();
});
// TODO: Call the custom instance method on the instance

module.exports = Book;
