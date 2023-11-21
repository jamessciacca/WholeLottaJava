// TODO: Create a function that returns a license badge based on which license is passed in
// If there is no license, return an empty string
function renderLicenseBadge(license) {}

// TODO: Create a function that returns the license link
// If there is no license, return an empty string
function renderLicenseLink(license) {}

// TODO: Create a function that returns the license section of README
// If there is no license, return an empty string
function renderLicenseSection(license) {}

// TODO: Create a function to generate markdown for README
function generateMarkdown(data) {
  return `# ${data.title}

  ## Description
     -${description}

     ## Table of Contents
   - [Installation](#installation)
   - [Usage](#usage)
   - [License](#license)
   - [Contributions](#contributions)
   - [Tests](#tests)
   - [Questions](#questions)
          
    ## Installation
    -${installation}


    ## Usage
    -${usage}


    ## License
    -${license}


    ## Contributions
    -${contributions}


    ## Tests
    -${tests}


    ## Questions
    If you have any questions about this Application, you can reach me at -
           
    -My Github - ${github}
    -My Email - ${email}`;
}

module.exports = generateMarkdown;
