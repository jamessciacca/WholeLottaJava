const express = require("express");
const app = express();

//allows restricted resources on a web page to be accessed from another domain outside the domain from which the first resource was served
const cors = require('cors');

//app object
app.use(cors());
app.use(express.json());

//port
const port = 3000;

app.get("/message", (req, res) => {
    res.json({ message: "Hello from server!" });
  });

app.listen(port, () => console.log(`Server Started on Port:${port}`))