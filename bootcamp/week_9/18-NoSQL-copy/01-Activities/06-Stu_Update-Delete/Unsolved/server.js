const express = require('express');
const mongodb = require('mongodb').MongoClient;
// We import the ObjectId class from mongodb
const { MongoClient, ObjectId } = require('mongodb');

const app = express();
const port = 3001;

const connectionStringURI = `mongodb://127.0.0.1:27017`;

const client = new MongoClient(connectionStringURI);

let db;

const dbName = 'inventoryDB';

client.connect()
  .then(() => {
    console.log('Connected successfully to MongoDB');
    db = client.db(dbName)});

    
    app.use(express.json());
    
    app.post('/create', (req, res) => {
      // The title and author will be provided by the request body
      db.collection('bookCollection').insertOne(
        { title: req.body.title, author: req.body.author }
        )
        .then(results => res.json(results))
        .catch(err => {
          if (err) throw err;
        });
      });
      
      app.get('/read', (req, res) => {
        db.collection('bookCollection')
        .find({})
        .toArray()
        .then(results => res.json(results))
        .catch(err => {
          if (err) throw err;
        });
      });
      
      // TODO: Add Delete route that uses a filter to delete a single document by id
      app.delete('/delete/:id', (req, res) => {
        db.collection('bookCollection')
        .deleteOne({
          _id: new ObjectId(req.params.id)
        })
        .then(result => res.json(result))
        .catch(err => {
          if (err) throw err;
        });
      });

      app.put('/update/:id', async (req, res) => {
        const updateData = req.body;
        try {
          await db.collection('bookCollection')
            .updateOne({
              _id: new ObjectId(req.params.id)
            }, {
              $set: {
                title: updateData.title,
                author: updateData.author
              }
            });
          res.send('Book updated successfully');
        } catch (err) {
          console.log(err);
        }
      });
      
      
      app.listen(port, () => {
        console.log(`Example app listening at http://localhost:${port}`);
      });
    })
    .catch((err) => {
      console.error('Mongo connection error: ', err.message);
    });

    