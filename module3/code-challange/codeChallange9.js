/*
Return the number of vowels in a string.
*/
function countVowels(str) {
    // Use a regular expression to match vowels (case-insensitive)
    const matches = str.match(/[aeiou]/gi);
    
    // If there are no matches, return "zero"
    if (matches === null) {
        return "zero";
    }

    // Convert the count of matches to its string representation for numbers from 1 to 5
    const countAsWords = {
        '1': 'one',
        '2': 'two',
        '3': 'three',
        '4': 'four',
        '5': 'five'
    };

    const countString = matches.length.toString();
    return countAsWords[countString];
}

const inputString = "Hello World";
const numberOfVowels = countVowels(inputString);
console.log(numberOfVowels); // Output: "three"