/* code for triangle having 3 sides, if all sides are same, 
it prints "equilateral triangle', 
ealse if at least two sides are equal, it prints 'issosceles triangle'
else if one are equal it prints 'scalene triangel' 
values can be changed to meet each condition
 */
const side1 = 69
const side2 = 61
const side3 = 50

if (side1===side2 && side1===side3) {
    console.log('Equilateral Triangle')
} else if (side1===side2 || side2===side3){
    console.log('Isosceles triangle')
} else {
    console.log('Scalene triangle')
}
