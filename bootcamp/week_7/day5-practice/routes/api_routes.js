const router = require('express').Router();
const {Book, Store} = require('../models');

//route to get one book 
router.get('/books/:book_id', async (req, res) => {
    //using the : to create a a parameter to hold the id value the user enters
    const book_id = req.params.book_id;

    const book = await Book.findByPk(book_id)

    res.send(book);

    if(book){
        res.send(book);
    } else res.send('No books found with that ID!');
})

//Route to GET all books
router.get('/books', async (req, res) => {
    const books = await Book.findAll();

    res.send(books);
});
//Route to CREATE a book
router.post('/books', async (req, res) => {
    const bookData = req.body;

    const newBook = await Book.create(bookData);

    res.send(newBook);
});

//route to get one Store 
router.get('/stores/:store_id', async (req, res) => {
    //using the : to create a a parameter to hold the id value the user enters
    const store_id = req.params.store_id;

    const store = await Store.findByPk(store_id)

    if(store){
        res.send(store);
    } else res.send('No books found with that ID!');
});


//ROute to GET all stores
router.get('/stores', async (req, res) => {
    const stores = await Store.findAll();

    res.send(stores);
});
//Route tro CREATE a store
router.post('/stores', async (req, res) => {
    const storeData = req.body;

    const newStore = await Store.create(storeData);

    res.send(newStore);
});

module.exports = router;