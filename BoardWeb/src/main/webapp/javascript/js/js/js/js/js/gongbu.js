

//123.toString();
/**console.log([1234, 456].toString());
console.log(false.toString());


const str1 = 'good morning, good afternoon, good evening, and good night';
// console.log(str1.indexOf('even'));

// console.log(str1.lastIndexOf('good'));

//console.log(str1.charAt(57));

console.log(str1.search('good'));*/



const keyword = '홍';
const wordAry = ['사과','홍씨','홍장군','김시홍','감자']
//1 배열에서 홍이 들어간 단어의 개수 구하기


/**console.log(wordAry.filter(val => val.indexOf(keyword) != -1).length);*/



//문자열로 합치기!
const arr =wordAry.join(',');




console.log(arr);

let count = 0;
for(let i =0; i< arr.length;i++){
    if(arr[i] == '홍'){
        count++;
    }
}
document.write(count);


const url =  'http:localhost/BoardWeb/index.jsp?x=12&y=23';
//2url에서 파라미터 (x,y)의값 찾기


console.log(url.match(/\d+/g)[0], url.match(/\d+/g)[1]);

/**function getParameterByID(id){
    id = id.replace()
}*/

console.log(word.replace(/xx/g,'').replace(/x/g,''));
