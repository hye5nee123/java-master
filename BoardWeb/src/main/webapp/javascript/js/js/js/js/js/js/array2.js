//array2.js
const numAry = [23, 10, 17, 35, 9];
//1.누적값 2. 배열요소
let result = numAry.reduce((acc, num) => {
    //console.log('초기값' + acc, num);

    return acc + num;
}, 0);

//누적하겠습니다 ^^

//console.log(`결과: ${result}`);


//제일 큰값 골라내기.
/**result = numAry.reduce((acc, num) => {
    return acc + num ? acc : num;
}, 0);

console.log(`결과: ${result}`);*/


// 1.최소값 2.평균


//1.최소값 

let min = numAry.reduce((acc, num) => {

    return acc < num ? acc : num;
});

console.log(`최소값${min}`);

//2.평균

/**result = numAry.reduce((acc, num,idx) => {

    result = numAry.reduce((acc,num,idx)=>{
        if(idx == numAry.length-1){
            return (acc+num) / numAry.length;
        }
    
    return acc+num;

    
},0);*/


// 10보다 큰 값을 새로운 배열.
result = numAry.reduce((acc, num) => {
    if (num > 10) {
        acc.push(num);
    }
    return acc;
}, []);


result = numAry.reduce((acc, num) => {
    if (num > 10) {
      
    }
    return acc;
});

console.log(result);

