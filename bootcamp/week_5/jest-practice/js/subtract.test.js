const subtract = require('./subtract')

test("we find the difference of two numbers correctly", ()=>{
    expect(subtract(2, 1)).toBe(1)
});

