
import {
    members,
    titles

} from './data.js';


console.log(members);
console.log(titles);

let str = titles.reduce((acc, title, idx) => {
    if (idx == 0) {
        acc += '<tr>';
    }
    acc += '<th>' + title + '</th>';
    if (idx == titles.length - 1) {
        acc += '</tr>';
    }
    return acc;
}, '');
console.log(str);
document.getElementById('theader').innerHTML = str;

const tbody = document.getElementById('tbody');

members.reduce((acc, member) => {
    let tr = document.createElement('tr');

    for (let prop in member) {
        let td = document.createElement('td');
        td.innerText = member[prop];
        tr.appendChild(td);
    }
    acc.appendChild(tr);
    return acc;
}, tbody);




/**for in 반복문 > 
 * 객체의 속성을 반복하여 작업 수행 가능*/
var obj = {
    a: 1,
    b: 2,
    c: 3
};

for (var prop in obj) {

    if (obj[prop] == 5) {
        console.log('OK');
    } else {
        console.log('NO');
    }
    console.log(prop, obj[prop]);
}

// map(A -> A'), filter(A -> B).
let result = members.map((item, idx) => {
    let obj = {}
    obj.id = item.id;
    obj.name = item.first_name + '-' + item.last_name;
    obj.email = item.email;
    return obj;
});

//filter : 이 조건에 맞는 값을 담아 주겠습니다. 
/**result = members//
    .filter(item => item.gender === 'Female')
result = members.filter(item => item.salary > 5000);

console.log(result);*/


//메소드 체인
result = members//
    .filter(item => item.gender === 'Female')
//result = members.filter(item => item.salary > 5000);
    .map((item, idx) => {
    let obj = {}
    obj.id = item.id;
    obj.name = item.first_name + '-' + item.last_name;
    obj.email = item.email;
    return obj;
    })
    .map(item => item.name);

    result.push('charles');
    result.push('Hong');
    result.push('charles');

    console.log(result.indexOf('charles'));



//filter 연습.

let array1 = [3,5,11,0,9,'string'];

let re = array1.filter((rr) => rr<10);
console.log(re);

function lessThanTen(rr){
    return rr < 10
    let result = array1.filter(lessThanTen);
}
lessThanTen();
console.log(result);