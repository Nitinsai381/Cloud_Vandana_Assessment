/* 1. Take a sentence as an input and reverse every word in that sentence. 
Example - This is a sunny day > sihT si a ynnus yad. */ 

function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(" ");

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); 
// Output: "sihT si a ynnus yad"