/*
Create a function that reverses an array.
*/

function reverseArray(arr) {
    return arr.reverse();
}

const originalArray = [2, 4, 6, 8, 10];
const reversedArray = reverseArray(originalArray);
console.log(reversedArray); // Output: [10, 8, 6, 4, 2]