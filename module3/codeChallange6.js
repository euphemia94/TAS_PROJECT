/*
Sort an array of strings in alphabetical order.
*/
const stringsArray = ["girl", "boy", "Mat", "Door", "Rain"];
const sortedArray = stringsArray.sort((a, b) => a.localeCompare(b));
console.log(sortedArray);