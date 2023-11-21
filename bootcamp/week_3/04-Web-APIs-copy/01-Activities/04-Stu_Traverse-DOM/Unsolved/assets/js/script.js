// Access element using id
var articlesDiv = document.getElementById('articles');
var headerDiv = document.getElementById('header');

// Change style by accessing style object's properties
articlesDiv.children[0].children[1].style.fontSize = '50px';
headerDiv.children[0].style.color = 'white';

//we used the properties tab in the console to find and add the correct
//child tags to make sure the font size and color was being applied to the 
//right objects!
