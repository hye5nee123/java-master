//array.js
// 배열 선언 방식
//ary = [];

//상수 배열 선언? >????????
const ary = ['1','2','3', new Date()];


const numAry = [10,20,30,40,50];

//제일 마지막에 요소 추가.
numAry.push(30);

//제일 처음에 요소 추가.
numAry.unshift(40);

// 제일 마지막 요소를 삭제하겠습니다.
numAry.pop();

//첫 번째 요소 삭제.
numAry.shift();

//(몇 번째 위치,몇개나 지우냐(2번째를 넣지 않으면...앞에 적은 idx부터 다 지워버림.))
numAry.splice(0,2);
numAry.splice(0);
//3개일시(몇 번째 위치,몇개나 바꾸냐,대체값)) >2 이상인 경우는 대체값 도 숫자만큼 넣어라.

numAry.splice(0,2,60,70);
//추가 쌉가능!
numAry.splice(0,9,10,20,30,40,50,60,70,80,90);

//배열 요소 전체 삭제 원하면
//numAry.splice(0);
console.log(numAry);

//배열 요소 지우기
//numAry.length =0;
//빈 값 만들어주기 (length는 읽기 속성이 아님.)
numAry.length =30;

console.log(numAry.length);

const numAry2 = [100,120];

// concat은 새배열을 반환함.
//const numAry3 = numAry.concat(numAry2);


//numAry에 numAry2를 추가.

numAry2.forEach(num =>numAry.push(num));


console.log(numAry);