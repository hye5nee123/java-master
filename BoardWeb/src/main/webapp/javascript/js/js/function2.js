// function2.js
let members = `[{"id":1,"first_name":"Delila","last_name":"Merioth","email":"dmerioth0@123-reg.co.uk","gender":"Female","salary":5217},
{"id":2,"first_name":"Julienne","last_name":"Roscamp","email":"jroscamp1@foxnews.com","gender":"Female","salary":6385},
{"id":3,"first_name":"Abramo","last_name":"Sapson","email":"asapson2@hc360.com","gender":"Male","salary":7067},
{"id":4,"first_name":"Anastasia","last_name":"Ginty","email":"aginty3@youtu.be","gender":"Female","salary":4818},
{"id":5,"first_name":"Gene","last_name":"Earingey","email":"gearingey4@plala.or.jp","gender":"Female","salary":3095},
{"id":6,"first_name":"Merill","last_name":"Issit","email":"missit5@yahoo.co.jp","gender":"Male","salary":4453},
{"id":7,"first_name":"Garek","last_name":"Parslow","email":"gparslow6@nymag.com","gender":"Male","salary":1482},
{"id":8,"first_name":"Cristian","last_name":"Cake","email":"ccake7@mozilla.org","gender":"Male","salary":9658},
{"id":9,"first_name":"Kore","last_name":"McPhee","email":"kmcphee8@skype.com","gender":"Female","salary":7236},
{"id":10,"first_name":"Dahlia","last_name":"Wrightson","email":"dwrightson9@shareasale.com","gender":"Female","salary":6246},
{"id":11,"first_name":"Mattie","last_name":"Fargie","email":"mfargiea@mashable.com","gender":"Female","salary":4469},
{"id":12,"first_name":"Nicolle","last_name":"Spavins","email":"nspavinsb@moonfruit.com","gender":"Female","salary":588},
{"id":13,"first_name":"Redd","last_name":"Steddall","email":"rsteddallc@gizmodo.com","gender":"Male","salary":9301},
{"id":14,"first_name":"Evin","last_name":"Tomet","email":"etometd@huffingtonpost.com","gender":"Male","salary":9471},
{"id":15,"first_name":"Hastings","last_name":"Durbann","email":"hdurbanne@illinois.edu","gender":"Male","salary":8645}]`;


let memberAry = JSON.parse(members);   //문자열 -> 객체변환.

console.log(memberAry[14]);

let titles = ['아이디','이름','성씨','이메일','성별','급여']  //tag 만들기 위한 data

function makeHeader(fields = [], pos = []){
    let tr = document.createElement('tr');
    fields.forEach(function(field){
        let th = document.createElement('th');
        th.innerText = field;
        tr.appendChild(th);    
    }) 
    pos.appendChild(tr);
}


makeHeader(titles, document.getElementById('theader'));



function makebody(data = [], pos = {}) {
    //
   
    data.forEach(function(item){
    let tr = document.createElement('tr');
    //tr에 속성지정.
    if(item.gender == 'Male'){
        tr.setAttribute('style','background-color:aqua');
    }else if(item.gender == 'Female'){
        tr.setAttribute('style','background-color:pink');
    }
    for(let prop in item) {
        let td = document.createElement('td');
        td.innerText=item[prop];
        tr.appendChild(td);

        
    }
    pos.appendChild(tr);
    }) 
}



makebody(memberAry, document.getElementById('tbody'));