const router = require('express').Router();

const fruits = ['orange', 'apple', 'kiwi'];

router.get('/api/fruits', (client_request, server_response)=> {
    server_response.send(fruits)
});

module.exports = router;