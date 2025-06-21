const num1 = parseFloat(prompt("Enter the first number:"));
const num2 = parseFloat(prompt("Enter the second number:"));

if (isNaN(num1) && isNaN(num2)) {
  alert("Please enter valid numbers.");
} else if (num1 > num2) {
  alert("The greater number is: " + num1);
} else if (num2 > num1) {
  alert("The greater number is: " + num2);
} else {
  alert("Both numbers are equal.");
}


//printing even numbers in an Array

const arr=[1,2,3,4,5,6,7,8,9,10]
const even_nums=arr.filter(arr => arr%2==0);
console.log(even_nums)

//Printing squares of every elements in an array

const ar=[1,2,3,4,5,6,7,8,9,10]
const square=ar.map(ar => ar*ar);
console.log(square);

//Capitalize the first letter of each word

const arrr=["apple","banana","carrot"]
const capitalizedWords = arrr.map(arrr=> {
  return arrr.charAt(0).toUpperCase() + arrr.slice(1);
});

console.log(capitalizedWords);

//Reverse the ARRAY

const arr1=[1,2,3,4,5]
let s=arr1.reverse();
console.log(s);

//Reverse a String

const str="Udaya";
let s1=str.split('').reverse().join('');
console.log(s1);

//array of objects

let users=[ {name : "Appu",marks :70 },
            {name : "Situ",marks :80 },
            {name : "Harry",marks :90 },
            {name : "Vinni",marks :86 },
]

for(let user of users)
{
    if(user.marks>=80)
    {
        console.log(user.name);
    }
}