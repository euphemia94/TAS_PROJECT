/*
Add a toggleReadingStatus method to your books objects in task 13 above. 
update the value of the reading property of the book object.
*/

const book = {
    title: 'How to start autoation',
    description: 'You will learn all about autoation',
    numberOfPages: 30,
    author: 'Ibironke ',
    reading:'false',
    toggleReading:function(){
        if(book.reading===true){
            book.reading=false
        } else{
            book.reading=true
        }
    }
}
book.toggleReading()
console.log(book.reading)