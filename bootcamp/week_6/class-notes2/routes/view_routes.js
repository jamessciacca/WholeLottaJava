const router = require('express').Router();
const path = require('path')

router.get('/about', (client_request, server_response)=>{
    server_response.sendFile(path.join(process.cwd(), 'views/about.html'))
})

module.exports = router;

