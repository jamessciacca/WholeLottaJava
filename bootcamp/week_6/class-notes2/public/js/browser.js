const getBtn = document.querySelector('#get-btn')
const ul = document.querySelector('#fruit-output');

function getFruits(){
    //makes a get request in JS
    fetch('/api/fruits')
    .then(res => res.json())
    .then(data=> {
        data.forEach(fruit=>{
            ul.insertAdjacentHTML('beforeend', `<li>${fruit}</li>`);
        })
    });
}


getBtn.addEventListener('click', getFruits);