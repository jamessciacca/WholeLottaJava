// Assignment Code
var passwordLength;
var lowercaseChar = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
var uppercaseChar = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
var numChar = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
var specialChar = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', '|', '?', '<', '>']

var generateBtn = document.querySelector("#generate");

// Write password to the #password input
function writePassword() {
  var correctPrompt = questionPrompt();
  var newPassword = generatePassword(correctPrompt);
  var passwordText = document.querySelector("#password");
  passwordText.value = newPassword;
}

function generatePassword(charArray){
  var password = '';
  for(i = 0; i < passwordLength; i++){
    var randomIndex = Math.floor(Math.random() * charArray.length)
    password = password + charArray[randomIndex];
  }
  return password;
}

function questionPrompt(){
  var charArray = [];

  var howManyChars = prompt('How many Charachters would you like, from 8 - 128?');
  passwordLength = parseInt(howManyChars);

  if ((howManyChars < 8) || (howManyChars > 128)){
      alert('Password length must be between 8 and 128 Characters, please try again!');
      return false;
    }
      if(confirm("Would you like lowercase letters?")){
        charArray = charArray.concat(lowercaseChar);
      }
 
      if(confirm("Would you like uppercase letters?")){
        charArray = charArray.concat(uppercaseChar);
      }
 
      if(confirm("Would you like any numbers?")){
        charArray = charArray.concat(numChar);
      }
 
      if(confirm("Would you like any special characters?")){
        charArray = charArray.concat(specialChar);
      }

      return charArray;
  }

// Add event listener to generate button
generateBtn.addEventListener("click", writePassword);

//Problems I am havign trouble figuring out are
//- how to have it saw no parameters were chosen!
//- how to make it not pront undefined or anything when no
//options are chosen!

