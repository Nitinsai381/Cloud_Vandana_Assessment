
//Perform sorting of an array in descending order.

const numbers = [5, 1, 9, 3, 7];

numbers.sort(function(a, b) {
    return b - a;
});

console.log(numbers); 
// Output: [9, 7, 5, 3, 1]
