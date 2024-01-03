//string1.js

let str1 = "Hello";
console.log(str1, typeof str1);
let str2 = new String("Hello");
console.log(str1, typeof str2);
console.log(str1, typeof str1);
console.log(str2, typeof str2);

console.log(str1 == str2);
console.log(str1 === str2);


let sub = str2.substring(1, 3);
console.log(sub);

// ==console.log(str2.substring(1,3));

let word = "          Hello, World";
//오른쪽 여백 삭제.
console.log(word.trimStart());
//왼쪽 여백 삭제.
console.log(word.trimEnd());
//양쪽 여백 삭제.
console.log(word.trim());

console.log(word.replace('H', 'h'));
console.log(word.replace(',', '.'));
console.log(word.replace('l', 'L'));
console.log(word.replace('ll', 'LL'));

//const obj = new Object(); {}
// const reg = new RegExp(); /값/
//g > global  >> 와 진짜 신기하다....
console.log(word.replace(/l/g, 'L'));

//공백을 다 찾아서 빈 공백으로 대체하겠습니다.   > 우와~
console.log(word.replace(/\s/g, ''));


word = '    how are you         today everyone.   ';
console.log(word.split(' ').filter((val) => {
    return val;
}).join(' '));


// =console.log(word.split(' ').filter(val => val).join(' '));

//console.log()







