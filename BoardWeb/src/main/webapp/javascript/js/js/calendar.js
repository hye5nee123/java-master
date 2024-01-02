// calendar.js
let days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat']

let lastDate = getLastDate(1);
let firstDate = getFirstDay(1);
console.log(lastDate, firstDate)
function getLastDate(month) {
    //월입력 => 마지막 날 반환. 31,29,31,30,31,30

    //switch 문
    switch (month) {
        case 4:

        case 6:
        case 9:
        case 11:
            return 30;
            break;
        case 2:
            return 29;
            break;
        default:
            return 31;




    }
}

//달력 생성.
function makeCalendar(month) {
    makeTitle(days, document.getElementById('theader'));
    makeBody(month, document.getElementById('tbody'));
}
makeCalendar(2);
//공백 반환(앞에 있는)
function getFirstDay(month) {
    //월입력 => 1일의 위치(공백이 몇개인지 반환.).

    switch (month) {
        case 1:
            return 1;
            break;
        case 2:
            return 4;
            break;
        case 3:
            return 5;
            break;
    }

}

//header 생성.
function makeTitle(dayAry = [], pos = {}) {

    let tr = document.createElement('tr');
    dayAry.forEach(function (field) {
        let th = document.createElement('th');
        th.innerText = field;
        tr.appendChild(th);
    })
    pos.appendChild(tr);

}

//날짜 생성.
function makeBody(month = 1, pos = {}) {
    let tr = document.createElement('tr');
    //공백
    let firstDay = getFirstDay(month);
    for (let i = 0; i < firstDay; i++) {
        let td = document.createElement('td');
        td.innerText = "";
        tr.appendChild(td);
    }
    //날짜.
    let lastDate = getLastDate(month);
    for (let i = 1; i <= lastDate; i++) {
        //토욜: pink. 일욜:aqua.
        let td = document.createElement('td');
        //td의 속성을 추가.

        if ((firstDay + i) % 7 == 1) {
            td.setAttribute('style', 'background-color:pink');
        } else if ((firstDay + i) % 7 == 0) {
            td.setAttribute('style', 'background-color:aqua');
        }

        /** if((firstDay+1)%7 ==0){
             td.setAttribute('style','background-color:pink');
         }else if((firstDay+1)%7 ==1){
             td.setAttribute('style','background-color:aqua');
         }*/
        td.innerText = i;
        tr.appendChild(td);
        if ((firstDay + i) % 7 == 0) {
            pos.appendChild(tr);
            tr = document.createElement('tr');
        }
    }
    pos.appendChild(tr);

    //날짜.

}

