/*
1. Calculate the sum of numbers within an array
*/

const numArray = [10, 20, 30, 1, 2, 3]
let sum
for (let i = 0; i < numArray.length; i++) {
    sum += numArray[i];
}
console.log("Sum of numbers:", sum);