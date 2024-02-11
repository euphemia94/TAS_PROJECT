/*
Create a function that filters out negative numbers.1.2.3.4.5.6.7.8.9.10
*/
function filterNegativeNumbers(arr) {
    return arr.filter(num => num >= 0);
}

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3];
const filteredNumbers = filterNegativeNumbers(numbers);
console.log(filteredNumbers); 