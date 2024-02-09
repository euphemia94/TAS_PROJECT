
/*
create an array of  books, each book having its proprities
 (title (string)
description (string)
numberOfPages (number)
authour (string)
reading (boolean))
Use a for-loop to loop through the books array and 
log all books where the reading status is true to the console
*/
const bookArray = [
    {
        title : "Book1",
        description:"Manual Testing Guide",
        numberOfPages : 10,
        authour : "Phemia",
        reading : false
    },
    {
        title : "Book2",
        description:"Navigating to Automation Testing",
        numberOfPages : 15,
        authour : "Mary",
        reading : true
    },
    {
        title : "Book3",
        description:"Automation Testing Guide",
        numberOfPages : 10,
        authour : "Phemia",
        reading : true
    }
]; 
for(let i=0; i <= bookArray.length; i ++){
    if (bookArray[i].reading===true) {
        console.log(bookArray[i])
    }
}
   
        console.log(bookArray);


