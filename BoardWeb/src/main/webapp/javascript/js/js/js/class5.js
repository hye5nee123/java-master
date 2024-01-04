//class5.js
//Map,Set.
const map = new Map();
map.set('김민규', 28,);
map.set('송강', 31);
map.set('서강준', 33);
map.set('전정국', 28);

console.log(map.get('김민규'));

console.log(map.keys());

for (let key of map.keys()) {
    console.log(key);
    console.log(`key는 ${key},value는 ${map.get(key)}`);
}



console.log(map.values());

//key와 value를 쌍으로 보여줌.
console.log(map.entries());



//배열처럼 가져옴.

for (let obj of map.entries()) {
    console.log(obj);
}



for (let [item, value] of map.entries()) {
    console.log(item, value);
}



//undefined로 받아옴...?

for (let { item, value } of map.entries()) {
    console.log(item, value);
}
//첫 번째 매개값이 값, 두 번째 매개값이 key.
map.forEach((val, key) => console.log('item은 ' + key + '  val는 ' + val));

/**둘은 ctrl+x 해서 위에 중간중간 넣어가며 test 필요. 
    필요없을 시에는 주석처리 ㄱㄱ.*/

//삭제
map.delete('송강');


//요소를 다 제거하겠다.
map.clear();




/**
 * 
 * 
 * set.set.set.set.set.set.set.set.set.set.set.set.set.
 * 
 * 
 * */
const set = new Set();

set.add('김민규');
set.add('송강');
set.add('서강준');
set.add('김민규');

//민규 안녕~ ㅠ-ㅠ ;;
set.delete('김민규');

//console창 더러워서.
console.clear();
//set은 메소드 아니고 속성이라 () 안 쓰고 , set은 중복을 허용하지 않음.
console.log(set.size);

//forEach랑 화살표 함수 아직도 헷갈림
set.forEach(name => console.log(name));

const numAry = [10, 14, 12, 10];

// 배열을 set 컬렉션에 담아준다.
const num = new Set(numAry); //배열 => set.

//중복된 값은 제거 확인.
num.forEach(number => console.log(number));





map.set('김명철', 80);
map.set('김익수', 70);
map.set('이명철', 80);
map.set('이익수', 85);
map.set('홍길동', 80);
//김씨 점수의 합계

// let obj =map.forEach((score,name) => console.log(name,score));
    let sum = 0;
 /**for (let obj of map.entries()) {
    if(name.indexOf('김') != -1){
        sum += score;
    }
}*/

//김씨 점수의 합계.
map.forEach((score,name) =>{
    if(name.indexOf('김') ==0){
        sum += score;
    }
})

console.log(`합계점수: ${sum}` )








