/*
Print a table containing multiplication tables.
*/
function printMultiplicationTable(size) {
    for (let i = 1; i <= size; i++) {
        let row = '';
        for (let j = 1; j <= size; j++) {
            row += (i * j) + '\t';
        }
        console.log(row);
    }
}

// Change the argument to adjust the size of the multiplication table
printMultiplicationTable(10); // Prints multiplication table up to 10x10

