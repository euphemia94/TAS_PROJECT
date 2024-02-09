/*
Create a length converter function.
*/
function metersToFeet(meters) {
    const feetPerMeter = 3.28084; // Conversion factor
    return meters * feetPerMeter;
}
const meters = 2;
const feet = metersToFeet(meters);

console.log(feet)