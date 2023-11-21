const path = require('path');
const router = require('express').Router();

const todos = [
    {
    id: 1,
    text: 'Get Groceries'
    },
    {
        id: 2,
        text: 'Take Out Trash'
    },
    {
        id: 3,
        text: 'Poop your pants!'
    }
];

//make a GET route to send array of todos
//when sending data the naming convention is to use api!
router.get('/todos', (client_req, server_res) => {
    server_res.send(todos);
});

router.get('/todos/:id', (client_req, server_res) => {
        const params = client_req.params;
        const todo = todos.find((obj) => {
            return obj.id == params.id
        });

        server_res.send(todo || 'No todos found!');
    });


module.exports = router;