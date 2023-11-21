  // Wrap all code that interacts with the DOM in a call to jQuery to ensure that
  // the code isn't run until the browser has finished rendering all the elements
  // in the html.
  const localeSettings = {};
  dayjs.locale(localeSettings);
  // Wait until the DOM is fully loaded before executing the code inside the function.
  $(function () {
    //fetching the current hour from the dayjs library
    const currentHour = dayjs().format('H');
  //changing the color of each div created 
    function hourlyColor() {
      $('.time-block').each(function() {
        const blockHour = parseInt(this.id);
        $(this).toggleClass('past', blockHour < currentHour);
        $(this).toggleClass('present', blockHour === currentHour);
        $(this).toggleClass('future', blockHour > currentHour);
      });
    }
  // saving the users entry when the button is clicked next to the corresponding hour
  //it will be saved in the local storage!
    function textEntry() {
      $('.saveBtn').on('click', function() {
        const key = $(this).parent().attr('id');
        const value = $(this).siblings('.description').val();
        localStorage.setItem(key, value);
      });
    }
   //this function changes the color of the black relative to the time of day
   //past hours being grey, present hours red, and future being green 
    function refreshColor() {
      $('.time-block').each(function() {
        const blockHour = parseInt(this.id);
        if (blockHour == currentHour) {
          $(this).removeClass('past future').addClass('present');
        } else if (blockHour < currentHour) {
          $(this).removeClass('future present').addClass('past');
        } else {
          $(this).removeClass('past present').addClass('future');
        }
      });
    }
    // setting the specific block the user saved text to with that text from the local storage
    $('.time-block').each(function() {
      const key = $(this).attr('id');
      const value = localStorage.getItem(key);
      $(this).children('.description').val(value);
    });
  
   //function to update the time on the page
   //this function uses the dayjs library to display the current accurate time
    function updateTime() {
      const dateElement = $('#date');
      const timeElement = $('#time');
      const currentDate = dayjs().format('dddd, MMMM D, YYYY');
      const currentTime = dayjs().format('hh:mm:ss A');
      dateElement.text(currentDate);
      timeElement.text(currentTime);
    }

    hourlyColor();
    textEntry();                
    refreshColor();
    //updating the time every second!
    setInterval(updateTime, 1000);
  });